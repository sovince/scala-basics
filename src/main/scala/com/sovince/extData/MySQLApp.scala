package com.sovince.extData

import java.sql.{Connection, DriverManager}

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/25
  * Time: 20:58
  * Description:
  */
object MySQLApp {
//  val driver = "com.mysql.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/test"
  val username = "root"
  val password = "123123"


  def main(args: Array[String]): Unit = {
    classOf[com.mysql.jdbc.Driver]//如果不写 分布式时易出问题

    var connection: Connection = null
    try{
      connection = DriverManager.getConnection(url,username,password)
      val stat = connection.prepareStatement("select * from city")
      val resultSet = stat.executeQuery()
      while (resultSet.next()){
        val id = resultSet.getInt("id")
        val name = resultSet.getString("name")
        println(s"$id:$name")
      }
    }catch {
      case e:Exception => e.printStackTrace()
    }finally {
      if(connection!=null){
        connection.close()
      }
    }

  }



}
