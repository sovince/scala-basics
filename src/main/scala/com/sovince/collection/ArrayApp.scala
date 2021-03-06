package com.sovince.collection

import java.util
import java.util.Collections

import scala.collection.mutable.ArrayBuffer

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/21
  * Time: 16:53
  * Description:
  */
object ArrayApp extends App {
  countSort(Array(3, 1, 5, 2, 2, 7)).foreach(println)

  //计数排序
  def countSort(array: Array[Int]): Array[Int] = {
    val raw = array
    val result = new ArrayBuffer[Int]()

    var max = 0
    raw.foreach(x => {
      if (x > max) max = x
    })
    var counter = new Array[Int](max + 1)

    raw.foreach(x => {
      counter(x) = counter(x) + 1
    })

    for (i <- counter.indices) {
      for (j <- 0 until counter(i)) {
        result += i
      }
    }

    result.toArray
  }

  def test(): Unit = {
    //定长数组
    val a = new Array[String](5)
    a(0) = "a"

    val b = Array("a", "b", "c") //调用了伴生apply

    val c = Array(1, 2, 3, 4, 5, 6, 7)
    println(c.max)
    println(c.mkString(","))

    //可变数组
    val m = ArrayBuffer[Int]()
    m += 1
    m += 2
    m += (3, 4, 5)
    m ++= Array(6, 7, 8)
    println(m)
    m.insert(1, 9)
    println(m)
    m.remove(1)
    println(m)
    m.trimEnd(2)
    println(m)

    println(m.toArray.mkString)

    for (i <- m.indices.reverse) {
      print(i)
    }

  }


}
