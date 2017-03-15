package com.controllers;


import static org.httpobjects.DSL.Json;
import static org.httpobjects.DSL.OK;

import java.util.Random;

import org.httpobjects.Request;
import org.httpobjects.Response;


public class ApiController {

  public static Response hello(Request request) {
    return OK(Json("{count: " + new Random().nextInt(999) + "}"));
  }
}


