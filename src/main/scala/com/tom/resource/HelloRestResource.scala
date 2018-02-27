package com.tom.resource

import javax.annotation.Resource
import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces}

import com.tom.base.BaseResource

/**
  * Created by Tom on 22-Feb-18.
  */
@Path("/hello")
@Resource
class HelloRestResource extends BaseResource {

  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  def get(): String = {
    println(systemConfig.baseProperties.hi)
    systemConfig.helloService.getHello
  }
}