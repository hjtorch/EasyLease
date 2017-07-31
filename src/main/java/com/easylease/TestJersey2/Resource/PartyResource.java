package com.easylease.TestJersey2.Resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.ws.rs.Consumes;
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
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "create a new party",
    notes = "create a new party")
    public Party createParty(Party party) {
    	
    	if(party == null) {
    		System.out.println("party is empty");
    	}
    	//PartyService service = new PartyService();
    	System.out.println(party.getTitle());
    	//System.out.println(party.owner_thumbnail);
    	//System.out.println(party.getTitle());
    	//service.createParty(party);
		return null;
    }
}
