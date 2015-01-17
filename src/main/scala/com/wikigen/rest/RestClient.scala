package com.wikigen.rest

import scala.util.parsing.json.JSON

/**
 * Created by Yuri on 11/01/2015.
 */
class RestClient (baseUrl:String, connection:HttpConnection) {

  def get(resourceUri: String) : Map[String,Any] = {
    val responseBody = connection.get(baseUrl+resourceUri)
    val parsed : Some[Map[String,Any]] = JSON.parseFull(responseBody).asInstanceOf[Some[Map[String,Any]]]
    return parsed.get
  }

}
