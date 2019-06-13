package com.sovince

import org.junit.Test

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/6/10
  * Time: 09:37
  * Description:
  */
class JTestApp{

  @Test
  def foo(): Unit ={
    print(1)

  }

  @Test
  def foo1(): Unit ={
    val s = "123456789"

    var result =0L
    var i,digit=0
    val len = s.length

    while (i<len){
      digit = Character.digit(s.charAt(i),10)
      i=i+1
      result = result*10
      result -= digit
    }
    println(-result)
  }

  @Test
  def foo2(): Unit ={
    println(('1'-'0')-1)
  }



}
