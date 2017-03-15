package com.main

import java.util.Random

import akka.actor.ActorSystem
import spray.routing.SimpleRoutingApp


object ApiServer extends App with SimpleRoutingApp {
  implicit val system = ActorSystem("my-system")

  startServer(interface = "localhost", port = 8080) {
    path("hello") {
      get {
        complete {
          "{count: " + new Random().nextInt(999) + "}"
        }
      }
    }
  }
}