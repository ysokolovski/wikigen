package com.wikigen

import java.io.File

import com.wikigen.config.WikiGenConfig
import com.wikigen.generator.Generator

/**
 * Created by Yuri on 10/01/2015.
 */
object WikiGen extends App {

  println("WikiGen 1.0.")
  if(args.length<4) {
    println("Usage: java WikiGen <URL> <user> <password> <structure file JSON>")
  } else if(!new File(args(3)).exists()) {
    println("Cannot find page structure file:"+args(3))
  } else {
    new Generator(new WikiGenConfig(args(0),args(1),args(2)),args(3)).run()
  }

}
