package com.wikigen.config

class WikiGenConfig (wikiUrl:String, wikiUser:String, wikiPassword:String) {
  def getUrl() = wikiUrl
  def getUser() = wikiUser
  def getPassword() = wikiPassword
}
