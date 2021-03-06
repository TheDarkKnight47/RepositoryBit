/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsonbtest;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ahsharma
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{name}")
    public String sayHello(@PathParam("name")@Pattern(regexp = "[0-9]+", message = "The id must be a valid number")String name){
        
        return "Hello "+name+" !! Welcome to Github";
    }
    
//    @GET
//    @PathParam("hello/{id}")
//    @Produces(MediaType.APPLICATION_XML)
//    public String sayHello(@PathParam("id")@Pattern(regexp = "[0-9]+", message = "The id must be a valid number")String id ) {
//        //TODO return proper representation object
//        return "Id is: "+id;
//    }
    
//    
//    /**
//     * Retrieves representation of an instance of com.mycompany.jsonbtest.GenericResource
//     * @return an instance of java.lang.String
//     */
//    
//
//    /**
//     * PUT method for updating or creating an instance of GenericResource
//     * @param content representation for the resource
//     */
//    @PUT
//    @Consumes(MediaType.APPLICATION_XML)
//    public void putXml(String content) {
//    }
}
