package com.sovince.impli

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/25
  * Time: 19:55
  * Description:
  */
object ImplicitParamApp extends App {
  implicit val man: Man = new Man("Vince")


  //直接匹配到了隐式参数  但不能有两个相同类型的隐式参数  歧义
  //但这和默认参数的应用场景有什么不同？
  doEat
  doEat(new Man("Ooo"))

  def doEat(implicit man: Man): Unit = {
    man.eat()
  }
}
