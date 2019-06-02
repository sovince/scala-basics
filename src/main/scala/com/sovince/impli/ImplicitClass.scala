package com.sovince.impli

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/25
  * Time: 20:04
  * Description:
  */
object ImplicitClass extends App {

  implicit class Calculator(x: Int) {
    def add(y: Int): Int = x + y
  }

  implicit class TextWrapper(s: String) {
    def around(string: String): String = {
      s"$string $s $string"
    }
  }

  println(1.add(2))

  println("Vince".around("***"))
}

