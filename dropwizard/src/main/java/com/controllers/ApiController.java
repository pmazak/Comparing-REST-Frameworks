package com.controllers;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class ApiController {

    @GET
    public String hello() {
        return "{count: " + new Random().nextInt(999) + "}";
    }
}