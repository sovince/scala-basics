package com.sovince.oop

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/20
  * Time: 16:35
  * Description:
  */
object SimpleObjectApp {


  def main(args: Array[String]): Unit = {
    val people = new People
    people.name = "A"
    people.eat()
    people.watch("a dog")
    println(people.age)
    people.printGender()
    println(people.hobby)
  }
}


class People {
  var name: String = _
  var age: Int = _

  //this可以省略 类外不能直接访问
  private[this] val gender: String = "male"

  // oop同包内可以直接访问
  private[oop] val hobby = "music"


  def eat(): Unit = {
    println(name + " eating")
  }

  def watch(something: String): Unit = {
    println(name + " is watching " + something)
  }

  def printGender(): Unit = {
    println("gender:" + gender)
  }
}
