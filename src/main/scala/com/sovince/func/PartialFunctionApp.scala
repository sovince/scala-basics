package com.sovince.func

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/24
  * Time: 21:28
  * Description:
  * 偏函数
  */
object PartialFunctionApp extends App {
  println(sayNumbers(1))


  //第一个类型是入参类型  第二个类型是返回值类型
  //实际就是省了match?
  def sayNumbers: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case _ => "I don't know"
  }
}
