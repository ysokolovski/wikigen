package com.wikigen.config.test

import com.wikigen.config._
import org.junit._

class WikiConfigTest {

  @Test
  def config(): Unit = {
    WikiGenConfig.password="password"
    WikiGenConfig.user="user"
    WikiGenConfig.wikiUrl="url"

    Assert.assertEquals("password",WikiGenConfig.password)
  }



}