package cn.ac.iie.utils.dns

import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

object DateUtil {

  private val sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
  private val etldate_sdf = new SimpleDateFormat("yyyyMMdd")

  /*def getCurrentDate(sdf:SimpleDateFormat=sdf)={
    val date = new Date()
    val currentDate = sdf.format(date)
    currentDate
  }*/

  def getCurrentDateTime(sdf:SimpleDateFormat=sdf)={
    val date = new Date()
    val currentDate = sdf.format(date)
    currentDate
  }

  //获取昨天日期
  def getEtlDate(dtf:SimpleDateFormat=etldate_sdf) ={
    val calendar = Calendar.getInstance()
    calendar.add(Calendar.DATE,-1)
    etldate_sdf.format(calendar.getTime)
  }

  def main(args: Array[String]): Unit = {
    println(getCurrentDateTime())
  }

}
