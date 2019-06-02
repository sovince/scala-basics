package com.sovince.oop

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/20
  * Time: 20:04
  * Description:
  */
object AbstractApp {
  def main(args: Array[String]): Unit = {
    val dog = new Dog("jo", "H")
    println(dog)

  }
}

abstract class Animal {
  def eat()

  var name: String
  var kind: String

  var age: Int = 1
}

class Dog(override var name: String, override var kind: String) extends Animal {
  override def eat(): Unit = println("eating")


  override def toString = s"Dog(name=$name, kind=$kind, age=$age)"
}