package com.sovince.expr

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/20
  * Time: 14:32
  * Description:
  */
object LoopApp {
  def main(args: Array[String]): Unit = {
    doTo()
    doArray()
    doWhile()
  }

  def doTo(): Unit ={
    for (i<- 1 to 10 if i%2==0){
      print(i+",")
    }
  }

  def doArray(): Unit ={
    val courses = Array("Hadoop","Spark","Flink")
    for (course<-courses){
      print(course+",")
    }

    courses.foreach(i=>print(i+","))
    println()
  }

  def doWhile(): Unit ={
    var (sum,num) = (0,100)
    while (num>0){
      sum +=num
      num = num-1
    }
    println(sum)
  }
}
