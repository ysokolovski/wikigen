package com.wikigen.rest.test

import org.junit.Test

/**
 * Created by ysokolov on 1/9/2015.
 */
class RestClientTest {

  @Test
  def get():Unit = {
    val restClient = new RestClient(TestConnection)
    val resource = restClient.get("/resource/1")
    assertEquals("1", response.id)
    assertEquals("name", response.name)
  }
}
