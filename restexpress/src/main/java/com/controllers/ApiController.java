package com.controllers;



import java.util.Random;

import org.restexpress.Request;
import org.restexpress.Response;


public class ApiController {

    public Object read(Request request, Response response) {
        response.addHeader("Content-Type", "application/json");
        return "{count: " + new Random().nextInt(999) + "}";
    }
}