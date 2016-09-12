package com.easylease.TestJersey2;

import java.io.IOException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.easylease.TestJersey2.Model.User;
import com.easylease.TestJersey2.Service.MyService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
@Api(value="/myresource")
@Produces({"application/json", "application/xml"})
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Test Swagger",
    notes = "Test Swagger note",
    response = String.class,
    responseContainer = "User")
    public User getIt() {
        //MyService service = new MyService();
    	User user =new User();
    	user.user_id = (long) 1;
    	user.user_firstname = "Ju";
    	user.user_lastname = "Huo";
    	user.user_email = "hjtorch@gmail.com";
        return user;
    }
}
