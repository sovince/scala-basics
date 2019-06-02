package com.sovince.func

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/24
  * Time: 19:32
  * Description:
  *
  * map,filter,flatmap,foreach,reduce
  */
object HigherFunctionApp extends App {
  val list = List(1, 2, 3, 4, 5, 6, 7, 8)

  //map 逐个去操作集合中的每个元素
  var l1 = list.map(x => x + 1)
  println(l1)
  //用占位符的简写方式
  var l2 = list.map(_ + 1)
  println(l2)

  //foreach
  list.map(_ * 2).foreach(print) //.foreach(print(_))
  println()
  //filter
  list.map(_ * 2).filter(x => x > 8).foreach(print)
  println()

  //reduce   1+2*2=5 5+2*3=11 11+2*4=19 ……
  val r1 = list.reduce((x, y) => x + 2 * y)
  val r2 = list.reduce(_ + 2 * _)
  println(r2)

  // 1-2=-1 -1-3=-4 -4-4=-8 -8-5=-13 -13-6=-19 -19-7=-26 -26-8=-34
  println("reduceLeft:" + list.reduceLeft(_ - _))
  // 7-8=-1 6-(-1)=7 5-7=-2 4-(-2)=6 3-6=-3 2-(-3)=5 1-5=-4
  println("reduceRight:" + list.reduceRight(_ - _))


  // 1-1=0 0-2=-2 …… -35
  println("foldLeft:" + list.foldLeft(1)(_ - _))
  // 8-1=7 7-7=0 6-0=6 5-6=-1 4-(-1)=5 3-5==-2 2-(-2)=4 1-4=-3
  println("foldRight:" + list.foldRight(1)(_ - _))
  //相当于在list的左或右加了元素1

  val ll = List(
    List(1, 2),
    List(3, 4),
    List(5, 6)
  )
  println("flatten:" + ll.flatten) //压扁了 降维打击

  //对二维结构中的每个元素+1需要两次map
  println(ll.map(_.map(_ + 1)))

  //对每个元素*2然后降维打击
  println(ll.flatMap(_.map(_ * 2)))

  var line1 = "a b c c"
  var line2 = "a a c c"
  var lines = List(line1, line2)

  var tuples = lines.flatMap(_.split(" ")).map(x => (x, 1)) //wordcount

  println(tuples)
}
