package com.sovince.test

import scala.collection.mutable.ArrayBuffer
import scala.collection.{Iterator, mutable}
import scala.io.Source

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/29
  * Time: 09:49
  * Description:
  */
object CountIp extends App {


  val ipFilePaths = Array("/Users/vince/temp/ip.txt","/Users/vince/temp/ip2.txt","/Users/vince/temp/ip3.txt")


  //得到每个文件结果
  val results = ArrayBuffer[mutable.HashMap[String,Integer]]()
  ipFilePaths.foreach(x=>{
    results += getOne(x)
  })
  val ipMapAll = mutable.HashMap[String, Integer]()

  results.foreach(map=>{
    println(map)
    map.foreach(x=>{
      val ip = x._1
      val times = x._2
      val current: Integer = ipMapAll.getOrElse(ip, -1)
      if (current == -1) {
        ipMapAll.put(ip, 1)
      } else {
        ipMapAll.put(ip, current + times)
      }
    })
  })
  println(ipMapAll)



  def getOne(filePath:String): mutable.HashMap[String, Integer] ={
    val ipFile = Source.fromFile(filePath)
    val lines = ipFile.getLines()
    val tuples = lines.map(x => (x, 1))
    //flatMap => map => tuple
    val ipMap = mutable.HashMap[String, Integer]()


    //reduceByKey
    tuples.filter(_._1 != "").foreach(x => {
      val ip = x._1
      val times = x._2
      val current: Integer = ipMap.getOrElse(ip, 0)
      ipMap.put(ip, current + times)
    })
    ipMap
  }


}
