package com.wikigen.config.test

import com.wikigen.config._
import org.junit._

class WikiConfigTest {

  @Test
  def config(): Unit = {
    val config = new WikiGenConfig("url","user","password")
    Assert.assertEquals("password",config.getPassword())
  }



}