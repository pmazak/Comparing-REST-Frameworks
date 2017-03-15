package com.controllers;

import java.util.Random;

import spark.Request;
import spark.Response;


public class ApiController {

    public static Object hello(Request req, Response res) {
        res.header("Content-type", "application/json");
        return "{count: " + new Random().nextInt(999) + "}";
    }
}
