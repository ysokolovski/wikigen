package com.wikigen.rest.test

import com.wikigen.rest.{RestClient, HttpConnection}
import org.junit.Test
import org.scalamock.scalatest.MockFactory
import org.scalatest.FlatSpec

/**
 * Created by ysokolov on 1/9/2015.
 */
class RestClientTest extends FlatSpec with MockFactory  {

    val mockConnection=stub[HttpConnection];



    val restClient = new RestClient(mockConnection)
    val resource = restClient.get("/resource/1")
    assertEquals("1", response.id)
    assertEquals("name", response.name)
  }
}
