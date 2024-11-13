package com.example;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;

public class CustomScope implements ScopeMetadataResolver {

    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition bd) {
        ScopeMetadata scopeMetadata = new ScopeMetadata();
        
        /*  Logic to assign custom scope based on class or bean definition */
        if (bd.getBeanClassName().endsWith("Scope")) {
            scopeMetadata.setScopeName("prototype");
        } else {
            scopeMetadata.setScopeName("singleton");
        }
        return scopeMetadata;
        // return null;
    }
}
