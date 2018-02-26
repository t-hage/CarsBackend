package com.tom.service

import org.springframework.stereotype.Service

/**
  * Created by Tom on 22-Feb-18.
  */
@Service
class HelloService {

  def getHello: String = {
    "Hello world from Service!"
  }

}
