package com.tom.service

import com.tom.base.BaseService
import org.springframework.stereotype.Service

/**
  * Created by Tom on 22-Feb-18.
  */
@Service
class HelloService extends BaseService{

  def getHello: String = {
    systemConfig.helloRepository.getHello
  }

}
