package com.sovince.impli

import java.io.File

/**
  * Created by vince
  * Email: so_vince@outlook.com
  * Data: 2019/4/25
  * Time: 19:47
  * Description:
  */
object MyImpliciteAspect {

  implicit def man2uperman(man: Man): Superman = new Superman(man.name)

  implicit def file2rRichFile(file: File): RichFile = new RichFile(file)
}
