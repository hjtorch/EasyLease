// shiqudev-env.us-west-2.elasticbeanstalk.com for prod
// localhost:8080/TestJersey2 for dev

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
        resources.add(com.easylease.TestJersey2.Resource.UserResource.class);
        resources.add(com.easylease.TestJersey2.Resource.ItemResource.class);
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);  
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        resources.add(org.glassfish.jersey.moxy.json.MoxyJsonFeature.class);
        resources.add(JsonMoxyConfigurationContextResolver.class);

        registerClasses(resources);  

        
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.3");
        beanConfig.setSchemes(new String[]{"http"});
        // for deployment
        beanConfig.setHost("candy-env.us-west-2.elasticbeanstalk.com");
        // for local
        //beanConfig.setHost("localhost:8080/TestJersey2");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.easylease.TestJersey2");
        beanConfig.setScan(true);
    }
}
