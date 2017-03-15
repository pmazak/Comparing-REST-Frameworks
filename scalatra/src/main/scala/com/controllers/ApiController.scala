package com.controllers

import java.util.Random

import org.scalatra.ScalatraServlet


class ApiController extends ScalatraServlet {
  get("/hello") {
    "{count: " + new Random().nextInt(999) + "}"
  }
}
