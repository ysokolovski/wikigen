package com.wikigen.rest

import java.util.logging.{Level, Logger}

import scala.util.parsing.json.JSON

/**
 * Created by Yuri on 11/01/2015.
 */
class RestClient (baseUrl:String, connection:HttpConnection) {

  val LOG: Logger = Logger.getLogger("com.wikigen.rest.RestClient")

  def get(resourceUri: String) : Map[String,Any] = {
    val uri: String = baseUrl + resourceUri
    val responseBody = connection.get(uri)
    LOG.log(Level.INFO,s"GET: $uri")
    val parsed : Some[Map[String,Any]] = JSON.parseFull(responseBody).asInstanceOf[Some[Map[String,Any]]]
    return parsed.get
  }

}
