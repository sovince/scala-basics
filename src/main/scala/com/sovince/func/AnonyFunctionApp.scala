package com.sovince.func

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/24
  * Time: 18:56
  * Description:
  */
object AnonyFunctionApp extends App {

  val f1 = (x: Int) => x + 1
  println(f1(2))
  println(add(4, 5))


  def add = (x: Int, y: Int) => x + y
}
