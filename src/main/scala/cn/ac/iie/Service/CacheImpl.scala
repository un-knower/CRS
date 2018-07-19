package cn.ac.iie.Service

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.regex.Pattern

object CacheImpl {

  def checkCache(array : Array[String]) : Boolean ={
    //流量为数字
    val isNumb=Pattern.compile("[0-9]*")
    //日期格式验证
    val isDate=Pattern.compile("^[1-9]\\d{3}\\/(0?[1-9]|1[0-2])\\/(0?[1-9]|[12]\\d|3[01])\\s*(0?[1-9]|1\\d|2[0-3])(\\:(0?[1-9]|[1-5]\\d)){2}$")
    //日期格式验证，精确到毫秒
    val isDate_accurate=Pattern.compile("^20[012]\\d-[01]\\d-[0123]\\d\\s\\d\\d:\\d\\d:\\d\\d:\\d\\d\\d$")
    //IP规则验证
    val isIP=Pattern.compile("^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$")
    if(array.length>=38
      &&isDate.matcher(array(0)).matches()==true
      //      &&isDate_accurate.matcher(array(15)).matches()==true
      //      &&isDate_accurate.matcher(array(16)).matches()==true
      &&isNumb.matcher(array(34)).matches()==true
      &&isNumb.matcher(array(14)).matches()==true
      &&array(12)!=""
    //      &&isIP.matcher(array(6))==true
    ){
      true
    }else{
      false
    }
  }

  //获取当前系统时间
  def getNowDate():String={
    var  dateFormat:SimpleDateFormat = new SimpleDateFormat("yyyyMMdd")
    var cal:Calendar=Calendar.getInstance()
    cal.add(Calendar.MINUTE,-5)
    var current = dateFormat.format(cal.getTime())
    current
  }

  //日期格式
  def getUpdateTime(str:String):String={
    var  dateFormat:SimpleDateFormat = new SimpleDateFormat("yyyyMMdd")
    var  dateFormat1:SimpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    var cal:Calendar=Calendar.getInstance()
    cal.add(Calendar.MINUTE,-5)
    var current = if(str=="")dateFormat.format(cal.getTime())else dateFormat.format(dateFormat1.parse(str))
    current
  }


}
