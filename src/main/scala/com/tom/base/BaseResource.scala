package com.tom.base

import com.tom.config.SystemConfig
import org.springframework.beans.factory.annotation.Autowired

/**
  * Created by Tom on 27-Feb-18.
  */
abstract class BaseResource {

  @Autowired
  var systemConfig: SystemConfig = _

}
