package com.controllers;


import org.httpobjects.Request;
import org.httpobjects.Response;


public interface Route {

    Response handle(Request request);
}
