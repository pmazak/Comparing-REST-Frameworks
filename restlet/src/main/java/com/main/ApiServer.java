package com.main;

import org.restlet.Server;
import org.restlet.data.Protocol;

import com.controllers.ApiController;


public class ApiServer {

    public static void main(String[] args) throws Exception {
        new Server(Protocol.HTTP, 8080, ApiController.class).start();
    }
}
