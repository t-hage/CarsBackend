package com.tom.resource

import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces}

/**
  * Created by Tom on 22-Feb-18.
  */
@Path("/hello")
class HelloRestResource {

  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  def get(): String = {
    "Rest Hello"
  }
}