package com.easylease.TestJersey2;

import java.io.IOException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.easylease.TestJersey2.Dao.UserDao;

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
    @Produces(MediaType.TEXT_PLAIN)
    @ApiOperation(value = "Test Swagger",
    notes = "Test Swagger note",
    response = String.class,
    responseContainer = "String")
    public String getIt() {
    	UserDao dao = null;
    	try {
			dao = new UserDao();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return dao.getUserById(1);
    	//return dao.getUserById(1);
    }
}
