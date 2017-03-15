package com.main

import javax.servlet.ServletContext

import com.controllers.ApiController
import org.scalatra.LifeCycle

class ApiServer extends LifeCycle {

  override def init(context: ServletContext) {
    context.mount(new ApiController, "/hello")
  }
}

object ApiServer {
  def main(args: Array[String]): Unit = {
    // Huh?
  }
}