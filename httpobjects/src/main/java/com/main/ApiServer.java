package com.main;

import java.util.ArrayList;
import java.util.List;

import org.httpobjects.HttpObject;
import org.httpobjects.Request;
import org.httpobjects.Response;
import org.httpobjects.netty.HttpobjectsNettySupport;

import com.controllers.ApiController;
import com.controllers.Route;


public class ApiServer {

    public static void main(String[] args) {
        int port = (System.getProperty("port") == null) ? 8080 : Integer.parseInt(System.getProperty("port"));
        List<HttpObject> routes = new ArrayList<>();
        routes.add(get("/hello", ApiController::hello));
        HttpobjectsNettySupport.serve(port, routes);
    }

    private static HttpObject get(String path, Route o) {
        return new HttpObject(path) {
            @Override
            public Response get(Request req) {
                return o.handle(req);
            }
        };
    }
}
