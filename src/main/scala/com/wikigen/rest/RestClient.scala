package com.wikigen.rest

import javax.annotation.Resource

import com.wikigen.config.WikiGenConfig

import scala.util.parsing.json.{JSON, JSONObject}

/**
 * Created by Yuri on 11/01/2015.
 */
class RestClient (connection:HttpConnection) {
  def get(resourceUri: String) : Option[Any] = {
    val responseBody = connection.get(resourceUri)
    JSON.parseFull(responseBody)
  }

}
