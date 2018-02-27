package com.tom.config

import com.tom.config.properties.BaseProperties
import com.tom.repository.HelloRepository
import com.tom.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
  * Created by Tom on 27-Feb-18.
  */
@Component
class SystemConfig {
  @Autowired
  var baseProperties: BaseProperties = _

  @Autowired
  var helloService: HelloService = _

  @Autowired
  var helloRepository: HelloRepository = _

}
