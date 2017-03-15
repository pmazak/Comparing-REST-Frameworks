package com.main;


import static spark.Spark.get;
import static spark.Spark.port;

import com.controllers.ApiController;


public class ApiServer {
    public static void main(String[] args) {
        port(System.getenv("PORT") == null ? 8080 : Integer.parseInt(System.getenv("PORT")));
        get("/hello", ApiController::hello);
    }
}
