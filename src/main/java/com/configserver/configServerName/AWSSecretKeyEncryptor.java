package com.configserver.configServerName;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.encryption.EnvironmentEncryptor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

@Service
public class AWSSecretKeyEncryptor implements EnvironmentEncryptor {

    private static final String amazonSecretPrefix = "{awsSecret}";
    private final AWSSecretManager awsSecretManager;

    public AWSSecretKeyEncryptor(AWSSecretManager awsSecretManager) {
        this.awsSecretManager = awsSecretManager;
    }

    @Override
    public Environment decrypt(Environment environment) {
        Map<String, Object> loadedVaultKeys = new HashMap<>();

        Environment result = new Environment(environment);
        for (PropertySource source : environment.getPropertySources()) {
            Map<Object, Object> map = new LinkedHashMap<>(source.getSource());
            for (Map.Entry<Object, Object> entry : new LinkedHashSet<>(map.entrySet())) {
                Object key = entry.getKey();
                String name = key.toString();
                if (entry.getValue() != null && entry.getValue().toString().startsWith(amazonSecretPrefix)) {
                    String value = entry.getValue().toString();
                    map.remove(key);
                    try {
                        value = value.substring(amazonSecretPrefix.length());

                        if (!value.startsWith(":")) {
                            throw new RuntimeException("Wrong format");
                        }

                        value = value.substring(1);

                        if (!loadedVaultKeys.containsKey(value)) {
                            loadedVaultKeys.put(value, awsSecretManager.getSecretValue(value));
                        }

                        // TODO check here what will be the value of return will be, definetly not string.
                        value = (String) loadedVaultKeys.get(value);

                    } catch (Exception e) {
                        value = "<n/a>";
                        name = "invalid." + name;
                        String message = "Cannot resolve key: " + key + " (" + e.getClass() + ": " + e.getMessage()
                                + ")";
                    }
                    map.put(name, value);
                }
            }
            result.add(new PropertySource(source.getName(), map));
        }
        return result;
    }
}
