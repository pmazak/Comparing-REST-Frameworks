package com.controllers;



import java.util.Random;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class ApiController extends ServerResource {

    @Get("txt")
    public String hello() {
        return "{count: " + new Random().nextInt(999) + "}";
    }
}