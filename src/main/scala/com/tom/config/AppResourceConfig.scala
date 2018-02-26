package com.tom.config

import javax.servlet.ServletContext

import org.springframework.core.annotation.Order
import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.ContextLoaderListener
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext

/**
  * Created by Tom on 22-Feb-18.
  */
@Order(1)
class AppResourceConfig() extends WebApplicationInitializer {

  override def onStartup(servletContext: ServletContext): Unit = {
    val ctx = new AnnotationConfigWebApplicationContext()

    servletContext.addListener(new ContextLoaderListener(ctx))
    servletContext.setInitParameter( "contextConfigLocation", "com.tom")
  }
}