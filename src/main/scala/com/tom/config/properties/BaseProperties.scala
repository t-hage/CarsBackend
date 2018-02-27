package com.tom.config.properties

import org.springframework.context.annotation.Configuration

/**
  * Created by Tom on 27-Feb-18.
  */
@Configuration
class BaseProperties extends ProperyConfigLoader{
  val hi: String = properties.getProperty("hi")
}
