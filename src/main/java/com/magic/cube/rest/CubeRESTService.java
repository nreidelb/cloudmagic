package com.magic.cube.rest;

import java.util.List;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.magic.cube.model.Card;
import com.magic.cube.model.Cube;
import com.magic.cube.service.CubeService;

@Path("/cube")
@RequestScoped
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class CubeRESTService {
	
	@Inject
	private CubeService cubeService;
	

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name}")
    public List<Card> getCardsInCube(@PathParam("name") String cubeName){
    	return cubeService.findCubeByName(cubeName);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name}")
    public Cube createCube(@PathParam("name") String name){
    	return cubeService.createCube(name);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name}/addOmenspeaker")
    public Cube addOmenspeaker(@PathParam("name") String name){
    	return cubeService.addOmenspeaker(name);
    }

}
