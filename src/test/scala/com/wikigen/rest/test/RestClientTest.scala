package com.wikigen.rest.test

import com.wikigen.rest.{HttpConnection, RestClient}
import org.junit.Assert._
import org.scalamock.scalatest.MockFactory
import org.scalatest.FlatSpec

/**
 * Created by ysokolov on 1/9/2015.
 */
class RestClientTest extends FlatSpec with MockFactory  {

    "Rest Client" should "return JSON object when requested by ID" in {

        val mockConnection = stub[HttpConnection];

        val restClient = new RestClient("http://fullurl",mockConnection)
        (mockConnection.get _) when ("http://fullurl/resource/1") returns ("{\"id\":\"1\", \"name\":\"name\"}");
        val response: Map[String,Any]= restClient.get("/resource/1")
        assertEquals("1", response("id"))
        assertEquals("name", response("name"))
    }
}
