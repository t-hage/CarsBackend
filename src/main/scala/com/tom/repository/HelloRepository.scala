package com.tom.repository

import com.tom.base.BaseRepository
import org.springframework.stereotype.Repository

/**
  * Created by Tom on 27-Feb-18.
  */
@Repository
class HelloRepository extends BaseRepository{

  def getHello: String = {
    "Hello dude."
  }
}
