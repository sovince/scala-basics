package com.sovince.oop

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/20
  * Time: 17:02
  * Description:
  */
object ConstructorApp {
  def main(args: Array[String]): Unit = {
    val person1 = new Person("A", 1)
    println(person1)

    val person2 = new Person("B", 1, "female")
    println(person2)

    println("-------------")
    val student = new Student("C", 1, "math")
    println(student)
    println(student.major)
  }
}

//主构造器
class Person(val name: String, val age: Int) {
  println("Person Constructor")
  val home = "hz"
  var gender: String = _

  //附属构造器
  def this(name: String, age: Int, gender: String) {
    this(name, age) //第一行必须调用主构方法或其他附属构造器
    this.gender = gender
  }


  override def toString = s"Person(home=$home, gender=$gender, name=$name, age=$age)"
}

class Student(name: String, age: Int, val major: String) extends Person(name, age) {
  println("Student Constructor")


}