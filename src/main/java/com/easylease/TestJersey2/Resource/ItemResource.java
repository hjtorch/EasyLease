package com.easylease.TestJersey2.Resource;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.easylease.TestJersey2.Model.Item;
import com.easylease.TestJersey2.Model.User;
import com.easylease.TestJersey2.Service.ItemService;
import com.easylease.TestJersey2.Service.UserService;

@Path("ItemResource")
@Api(value="/ItemResource")
@Produces({"application/json", "application/xml"})
public class ItemResource {
    @GET
    @Path("/getAllItems")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get all items",
    notes = "get all items",
    response = Item.class,
    responseContainer = "List")
    public List<Item> getAllItems() {
    	ItemService service = new ItemService();
        return service.getAllItems();
    }
}
