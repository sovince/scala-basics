package com.sovince.matchMode


/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/22
  * Time: 21:00
  * Description:
  */
object Match {
  def main(args: Array[String]): Unit = {
    wordToSay("?","h")
    findCaptain(Array("Jack","B"))

    matchType(1)
  }

  def wordToSay(word: String,option:String): Unit = {
    word match {
      case "hi" => println("hello")
      case "fuck" => println("淦")
      case _ if option=="h" => println("H")
      case _ => println("what?")
    }
  }

  def findCaptain(crew:Array[String]): Unit ={
    crew match {
      case Array("Jack") => println("Hi captain!")
      case Array("Jack",_*) => println("Hi captain and cums")
      case Array(x,y) => println(x+" and "+y)
      case _ => println("Everybody!")
    }

  }

  def matchType(param:Any): Unit ={
    param match {
      case x:String => println("String")
      case x:Int => println("Int")
      case _ =>println("unknown")
    }

  }

  //类型匹配的引申  多态匹配

  //Map.get()  Some None的匹配

}
