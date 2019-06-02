package com.sovince.extData

import scala.io.{Codec, Source}

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/25
  * Time: 20:36
  * Description:
  */
object FileApp extends App {


  val file = Source.fromFile("/Users/vince/temp/file.txt")(Codec.UTF8) //Codec 可以隐式转换

  val lines = file.getLines()

  //  file.foreach(print)
  lines.foreach(println)

  val html = Source.fromURL("http://www.baidu.com").mkString
  println(html)

}
