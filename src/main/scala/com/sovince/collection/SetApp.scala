package com.sovince.collection

import scala.collection.mutable

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/22
  * Time: 19:40
  * Description:
  */
object SetApp extends App {
  val s = Set(1,1,2,3)
  println(s)

  val ms = mutable.HashSet[Int]()
  ms +=1
  ms +=9
  ms ++=s
  println(ms)

}
