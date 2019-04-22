package com.sovince.MatchMode

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/22
  * Time: 22:01
  * Description:
  */
object ExceptionApp extends App {

  try {
    var res:Int = 1/0
    println(res)
  }catch {
    case e:ArithmeticException => println("被除数不能为0")
    case e:Exception => println(e.getMessage)
  }finally {
    //do something that must be done
  }


}
