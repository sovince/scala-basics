package com.sovince.collection

import scala.collection.mutable

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/22
  * Time: 19:59
  * Description:
  */
object MapApp extends App {
  val m = scala.collection.mutable.Map[String,Int]("v"->1)
  println(m)
  m("v")=2
  m("o")=9
  println(m)

  val hm = mutable.HashMap[String,Int]()

  hm.put("s",1)
  hm+=("a"->2)

  println(hm)
  println(hm.get("a"))
  println(hm.get("x"))
  println(hm.getOrElse("a",-1))

}
