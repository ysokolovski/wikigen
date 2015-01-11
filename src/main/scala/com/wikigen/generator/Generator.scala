package com.wikigen.generator

import com.wikigen.config.WikiGenConfig

/**
 * Created by Yuri on 10/01/2015.
 */
class Generator(val config:WikiGenConfig, val fileName:String) {

  def run(): Unit = {
    println("Generating page at "+config.wikiUrl)
  }

}
