package com.configserver.configServerName;

public interface AWSSecretManager {
    String getSecretValue(String secretKey);
}
