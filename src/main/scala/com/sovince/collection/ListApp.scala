package com.sovince.collection

import scala.collection.mutable.ListBuffer

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/22
  * Time: 18:53
  * Description:
  */
object ListApp {
  def main(args: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5)
    println(l)
    println(l.head)
    println(l.tail)

    val list = 1 :: List(4, 5, 6)
    println(list)
    println(1 :: Nil)
    println(1 :: list)

    println("==============")

    val ml = ListBuffer[Int]()
    ml += 1
    ml ++= List(3, 2, 1)
    println(ml)
    ml -= 1
    println(ml)

    println(ml.sum)

  }

}
