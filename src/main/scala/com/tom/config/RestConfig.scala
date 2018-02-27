package com.tom.config

import javax.ws.rs.ApplicationPath

import org.glassfish.jersey.server.ResourceConfig

/**
  * Created by Tom on 26-Feb-18.
  */
@ApplicationPath("/resources")
class RestConfig extends ResourceConfig {
  packages("com.tom.resource")
}
