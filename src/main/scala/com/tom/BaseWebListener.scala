package com.tom

import javax.ws.rs.ApplicationPath

import org.glassfish.jersey.server.ResourceConfig

/**
  * Created by Tom on 22-Feb-18.
  */
@ApplicationPath("/")
class BaseWebListener extends ResourceConfig {
    packages("com.tom.resource")
}