package com.sovince.func

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/24
  * Time: 19:01
  * Description:
  */
object CurryFunctionApp extends App {
  println(addCurry(1)(2))


  /**
    * 普通函数写法  两个参数
    */
  def add(x: Int, y: Int) = x + y

  /**
    * curry化之后的函数
    */
  def addCurry(x: Int)(y: Int) = x + y

}
