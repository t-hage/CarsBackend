package com.tom.resource

import javax.annotation.Resource
import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces}

import com.tom.service.HelloService
import org.springframework.beans.factory.annotation.Autowired

/**
  * Created by Tom on 22-Feb-18.
  */
@Path("/hello")
@Resource
class HelloRestResource {

  @Autowired
  var helloService: HelloService = _

  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  def get(): String = {
    helloService.getHello
  }
}