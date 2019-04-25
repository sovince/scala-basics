package com.sovince.impli

import java.io.File

import scala.io.Source

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/25
  * Time: 19:08
  * Description:隐式转换 实现了代理
  */
import MyImpliciteAspect._

object ImplicitApp extends App {
  becomeSuperman()

  readFile()


  def becomeSuperman(): Unit ={

    //用superman对man中没有的方法和属性进行了增强
//    implicit def man2uperman(man:Man):Superman = new Superman(man.name)
    //统一 import MyImpliciteAspect._
    val man = new Man("Vince")
    man.fly()
    man.eat()
    println(man.factor)
    println(man.i)
  }
  def readFile(): Unit ={
//    implicit def file2rRichFile(file: File):RichFile = new RichFile(file)
    val file = new File("/Users/vince/temp/a")

    println("file.read: "+file.read())
  }

}

class Man(val name:String){
  val factor = 0
  def  eat(): Unit ={
    println(s"$name is eating")
  }
}

class Superman(val name:String){
  val factor = 1
  val i = 9
  def fly(): Unit = {
    println(s"$name is flying")
  }
  def eating(): Unit ={
    println("???")
  }

}

class RichFile(val file:File){
  def read(): String ={
    Source.fromFile(file.getPath).mkString
  }
}

