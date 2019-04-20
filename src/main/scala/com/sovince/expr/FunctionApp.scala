package com.sovince.expr

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/20
  * Time: 11:32
  * Description:
  */
object FunctionApp {
  def main(args: Array[String]): Unit = {
    println(add(1,2))
    println(useAdd)
    println(callOptionParam())
    println(callOptionParam("hello"))
    println(speed(time = 10,distance = 100))//不建议

    println(sum(1,2,3,4))
  }

  //最后一行作为返回值
  def add(x:Int,y:Int): Int ={
    x+y
  }

  //简写
  def useAdd:Int = add(5,6)+1

  //默认参数，指定缺省值
  def callOptionParam(word:String="hi"): String = word

  //命名参数使用
  def speed(distance:Float,time:Float): Float ={
    distance/time
  }

  //可变参数
  def sum(numbers:Int*): Int ={
    var result = 0
    for(number<-numbers){
      result += number
    }

    result
  }

}
