package com.main;

import java.util.Random;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;


public class ApiServer extends AbstractVerticle {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        Router router = Router.router(vertx);

        router.route("/hello").handler(routingContext -> {
            routingContext.response().putHeader("content-type", "text/html").end("{count: " + new Random().nextInt(999) + "}");
        });

        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}
