package com.imooc.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

/**
  * User: searainbow
  */
@RestController
class ScalaHelloBoot {

  @RequestMapping(value = Array("/sayScalaHello"), method = Array(RequestMethod.GET))
  def sayScalaHello() = {
    "Hello Scala Boot..."
  }
}