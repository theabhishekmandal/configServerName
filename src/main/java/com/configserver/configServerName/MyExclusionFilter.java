package com.configserver.configServerName;

import org.springframework.boot.autoconfigure.AutoConfigurationImportFilter;
import org.springframework.boot.autoconfigure.AutoConfigurationMetadata;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyExclusionFilter implements AutoConfigurationImportFilter {
    @Override
    public boolean[] match(String[] autoConfigurationClasses, AutoConfigurationMetadata autoConfigurationMetadata) {
        System.out.println(Arrays.toString(autoConfigurationClasses));
        return new boolean[0];
    }
}
