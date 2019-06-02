package com.sovince.test

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/29
  * Time: 09:49
  * Description:
  */
object WordCount extends App {


  val filePaths = Array(
    "/Users/vince/temp/1.txt",
    "/Users/vince/temp/2.txt",
    "/Users/vince/temp/3.txt",
    "/Users/vince/temp/4.txt"
  )

  //得到每个文件结果
  val results = ArrayBuffer[mutable.HashMap[String,Integer]]()
  filePaths.foreach(x=>{
    results += map(x)
  })
  val wordMapAll = mutable.HashMap[String, Integer]()

  results.foreach(map=>{
    println(map)
    map.foreach(x=>{
      reduce(x,wordMapAll)
    })
  })

  wordMapAll.foreach(println)

  def map(filePath:String): mutable.HashMap[String, Integer] ={
    val file = Source.fromFile(filePath)
    val lines = file.getLines()
    val tuples = lines.flatMap(_.split(" ")).map(x => (x,new Integer(1)))
    //flatMap => map => tuple
    val wordMap = mutable.HashMap[String, Integer]()

    //reduceByKey
    tuples.filter(_._1 != "").foreach(x =>reduce(x,wordMap))
    wordMap
  }

  def reduce(x: (String,Integer),map:mutable.HashMap[String, Integer]): Unit ={
    val word = x._1
    val times = x._2
    val current: Integer = map.getOrElse(word, 0)
    map.put(word, current + times)
  }
}
