package com.sovince.collection

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/22
  * Time: 20:32
  * Description:
  */
object Tuple extends App {

  val t = (1,2,3,4)
  println(t._1)
  println(t.productElement(0))

  for (i<-0 until t.productArity){
    print(t.productElement(i))
  }
  println()

  val (a,b) = (1,2)
  println(b)

}
