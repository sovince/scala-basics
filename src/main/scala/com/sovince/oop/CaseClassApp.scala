package com.sovince.oop

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/20
  * Time: 21:13
  * Description:
  */
object CaseClassApp {
  def main(args: Array[String]): Unit = {
    val cat = Cat("po")
    println(cat.name)
  }

}

//不用new
//通常用在模式匹配
//当bean用也可？
case class Cat(name:String)