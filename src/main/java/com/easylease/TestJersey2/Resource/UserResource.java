package com.easylease.TestJersey2.Resource;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.easylease.TestJersey2.Model.User;
import com.easylease.TestJersey2.Service.UserService;

@Path("UserResource")
@Api(value="/UserResource")
@Produces({"application/json", "application/xml"})
public class UserResource {
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/getAllUsers")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get all users",
    notes = "get all users",
    response = User.class,
    responseContainer = "List")
    public List<User> getAllUsers() {
        UserService service = new UserService();
        return service.getAllUsers();
    }
}
