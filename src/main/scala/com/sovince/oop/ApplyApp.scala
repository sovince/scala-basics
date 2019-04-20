package com.sovince.oop

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/20
  * Time: 20:28
  * Description: 伴生
  *
  * //class Cup 是 object Cup 的伴生类
  * //反之 object Cup 是 class Cup 的伴生对象
  * //互为伴生
  */
object ApplyApp {
  def main(args: Array[String]): Unit = {
//    for (i<-1 to 10){
//      Cup.incr()
//    }
//    println(Cup.count)//这说明object是个单例


    println("-----------------")
    val c = Cup()//通过单例object拿到class对象
    val d = Cup()
    println(c)//拿到的是不同的对象
    println(d)
    println("-----------------")
    Cup.apply()
    println("-----------------")
    c.apply()


    //总结
    // 类名() ==>  object.apply
    // 对象() ==> class.apply
  }

}


class Cup{
  println("class in")
  println("class out")
  def apply(): Unit ={
    println("Class Cup apply")
  }
}

object Cup{
  println("object in")
  println("object out")

  var count=0
  def incr():Unit={
    count=count+1
  }


  def apply(): Cup ={
    println("Object Cup apply")
    new Cup()
  }
}