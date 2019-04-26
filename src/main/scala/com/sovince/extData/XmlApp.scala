package com.sovince.extData

import scala.xml.XML

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/26
  * Time: 15:54
  * Description:
  */
object XmlApp extends App {
  val xml = XML.load(this.getClass.getClassLoader.getResource("my.xml"))
  //  println(xml)
  //  xml.foreach(x=>println(x.text))

  val id = xml \ "mirrors" \ "mirror" \ "id"
  println(id)
  println(id.text)



}
