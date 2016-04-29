package com.easylease.TestJersey2;

import io.swagger.jaxrs.config.BeanConfig;

import java.util.HashSet;
import java.util.Set;

import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig  {
    public MyApplication() { 
        packages("com.easylease.TestJersey2"); 
        // register swagger
        Set<Class<?>> resources = new HashSet<>();  
        resources.add(com.easylease.TestJersey2.MyResource.class);
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);  
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        registerClasses(resources);  

        
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/TestJersey2/api");
        beanConfig.setResourcePackage("com.easylease.TestJersey2");
        beanConfig.setScan(true);
    }
}
