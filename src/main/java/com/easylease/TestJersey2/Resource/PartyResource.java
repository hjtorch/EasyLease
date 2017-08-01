package com.easylease.TestJersey2.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.sql.Time;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.easylease.TestJersey2.Model.Party;
import com.easylease.TestJersey2.Service.PartyService;

@Path("PartyResource")
@Api(value="/PartyResource")
//@Produces({"application/json", "application/xml"})
public class PartyResource {
    @GET
    @Path("/getAllParties")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get all parties",
    notes = "get all parties",
    response = Party.class,
    responseContainer = "List")
    public List<Party> getAllParties() {
    	PartyService service = new PartyService();
        return service.getAllParties();
    }
    
    @POST
    @Path("/createParty")
    @Produces("application/json")
    @ApiOperation(value = "create a new party",
    notes = "create a new party")
    public Party createParty(
    		@FormParam(value = "title") String title,
    		@FormParam(value = "owner") String owner,
    		@FormParam(value = "owner_thumbnail") String owner_thumbnail) {
    	
    	PartyService service = new PartyService();
    	Party party = new Party();
    	party.title = title;
    	party.owner = owner;
    	party.owner_thumbnail = owner_thumbnail;
    	
    	service.createParty(party);
    	
    	return party;
    }
}
