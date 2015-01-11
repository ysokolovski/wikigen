package com.wikigen.rest

/**
 * Created by ysokolov on 1/9/2015.
 */
trait HttpConnection {
  def get(uri:String) : String
  def post(uri:String, json:String)
  def put(uri:String,json:String)
  def delete(uri:String)
}
