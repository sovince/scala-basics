package com.sovince.test

import scala.io.Source

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/6/11
  * Time: 19:39
  * Description:
  */
object WordCount2 extends App {
  val file = Source.fromFile("/Users/vince/temp/1.txt")
  val text = file.getLines().toArray

  val tuples:Array[(String,Int)] = text.flatMap(x=>x.split(" ")).map((_,1))

  val result = tuples
    .groupBy(_._1)
    .map(x=>(x._1,x._2.length))
    .toList
    .sortWith((x,y)=> x._2>y._2)
  println(result)

  //Array(
  // (Hadoop,Array((Hadoop,1), (Hadoop,1))),
  // (Hello,Array((Hello,1))),
  // (Spark,Array((Spark,1))),
  // (Hive,Array((Hive,1)))
  // )

}
