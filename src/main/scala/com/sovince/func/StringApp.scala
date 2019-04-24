package com.sovince.func

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/24
  * Time: 18:42
  * Description:
  */
object StringApp {
  def main(args: Array[String]): Unit = {

    singleLine()

    multiLines()
  }

  def singleLine(): Unit ={
    val name = "Anne"
    val nation = "China"

    println(s"Hello $name,welcome to $nation")
  }

  def multiLines(): Unit ={
    val name = "Vince"
    val nation = "British"
    val s =
      s"""
        |Hello $name

        |Welcome to $nation
        |
      """.stripMargin
    println(s)
  }
}
