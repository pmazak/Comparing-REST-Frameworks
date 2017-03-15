package com.main;

import org.restexpress.RestExpress;

import io.netty.handler.codec.http.HttpMethod;

import com.controllers.ApiController;


public class ApiServer {

    public static void main(String[] args) throws Exception {
        RestExpress server = new RestExpress();
        server.uri("/hello", new ApiController()).method(HttpMethod.GET);
        server.bind(8080);
        System.out.println("Hit enter to stop it...");
        System.in.read();
        server.shutdown();
    }
}
