package com.main;

import com.controllers.ApiController;
import io.undertow.Handlers;
import io.undertow.Undertow;


public class ApiServer {

    public static void main(final String[] args) {
        Undertow server = Undertow.builder()
                .addHttpListener(8080, "localhost")
                .setHandler(Handlers.pathTemplate()
                        .add("/hello", new ApiController())
                ).build();
        server.start();
    }
}
