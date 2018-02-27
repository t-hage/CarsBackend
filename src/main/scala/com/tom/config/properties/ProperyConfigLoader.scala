package com.tom.config.properties

import java.util.Properties

/**
  * Created by Tom on 27-Feb-18.
  */
abstract class ProperyConfigLoader {
  // TODO use typesafe Config? https://github.com/lightbend/config

  private val propertiesFile = getClass.getClassLoader.getResource("config.properties")

  val properties: Properties = loadProperties

  private def loadProperties: Properties = {
    val properties = new Properties()
    val propertiesFileStream = propertiesFile.openStream()
    properties.load(propertiesFileStream)

    propertiesFileStream.close()
    properties
  }

}
