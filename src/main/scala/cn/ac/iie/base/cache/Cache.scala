package cn.ac.iie.base.cache

case class Cache (
                   //1 日志写入时间
                   val date:String,
                   //2 缓存设备信息
                   val deviceip:String,
                   //3 用户IP地址
                   val userIP:String,
                   //4 用户请求IP地址
                   val serverip:String,
                   //5 Http method
                   val httpmethod:String,
                   //6 HTTP Version
                   val httpversion:String,
                   //7 HTTP Host
                   val host:String,
                   //8 HTTP Uri
                   val uri:String,
                   //9 HTTP User-agent
                   val userAgent:String,
                   //10 HTTP Referer
                   val referer:String,
                   //11 HTTP Content-type
                   val contentType:String,
                   //12 HTTP应答的Status-code字段内容HTTP应答的Status-code字段内容
                   val statusCode:String,
                   //13 缓存命中状态
                   val cacheState:String,
                   //14 缓存服务端口
                   val cacheHost:String,
                   //缓存吐出流量
                   val cacheFlow:String,
                   //请求开始时间
                   val requeststartdate:String,
                   //请求结束时间
                   val requestenddate:String,
                   //首字节响应时间
                   val firstresponsetime:String,
                   //URL Hash值
                   val urlhashcode:String,
                   //缓存命中类型
                   val cachetype:String,
                   //回源源IP地址
                   val backsourceip:String,
                   //回源目的IP地址
                   val backtargetip:String,
                   //回源HTTP Method
                   val backhttpmethod:String,
                   //回源HTTP Version
                   val backhttpversion:String,
                   //回源HTTP Host
                   val backhost:String,
                   //回源HTTP Uri
                   val backuri:String,
                   //回源HTTP Content-type
                   val backcontenttype:String,
                   //回源HTTP Status-code
                   val backstate:String,
                   //回源关闭状态
                   val backclosestate:String,
                   //回源Cache-Control
                   val backcachecontrol:String,
                   //回源Max-age
                   val backmaxgge:String,
                   //回源文件大小
                   val backfilesize:String,
                   //缓存保存状态
                   val backsavestate:String,
                   //回源服务端口
                   val backserverport:String,
                   //回源流量
                   val backflow:String,
                   //回源请求开始时间
                   val backrequeststartdate:String,
                   //回源请求结束时间
                   val backrequestenddate:String,
                   //源站首字节响应时间
                   val backfirstresponsetime:String,
                   //厂商
                   val factory:String,
                   //缓存类型
                   val cache_type:String,
                   //省份
                   val prov:String,
                   //地市
                   val city:String,
                   //省会标识
                   val provincial_capital:String,
                   //接入方式
                   val access_type:String,
                   //用户终端类型
                   val user_terminal:String,
                   //网站ID
                   val websiteid:String,
                   //网站名（中文）
                   val websitename:String,
                   //泛域名
                   val main_domain:String,
                   //文件类型
                   val file_type:String,
                   //省份
                   val province:String,
                   //数据的业务时间
                   val ds:String

                 )extends Serializable

object Cache{
  def apply(arr:Array[String],factory:String,cache_type:String,province:String,city:String,provincial_capital:String,access_type:String,user_terminal:String,websiteid:String,websitename:String,main_domain:String,file_type:String,ds:String,prov:String)={
    val provincial_capital="N"
    //    val provincial_capital=""
    new Cache(
      arr(0)
      ,arr(1)
      ,arr(2)
      ,arr(3)
      ,arr(4)
      ,arr(5)
      ,arr(6)
      ,arr(7)
      ,arr(8)
      ,arr(9)
      ,arr(10)
      ,arr(11)
      ,arr(12)
      ,arr(13)
      ,arr(14)
      ,arr(15)
      ,arr(16)
      ,arr(17)
      ,arr(18)
      ,arr(19)
      ,arr(20)
      ,arr(21)
      ,arr(22)
      ,arr(23)
      ,arr(24)
      ,arr(25)
      ,arr(26)
      ,arr(27)
      ,arr(28)
      ,arr(29)
      ,arr(30)
      ,arr(31)
      ,arr(32)
      ,arr(33)
      ,arr(34)
      ,arr(35)
      ,arr(36)
      ,arr(37)
      ,factory,
      cache_type,
      province,
      city,
      provincial_capital,
      access_type,
      user_terminal,
      websiteid,
      websitename,
      main_domain,
      file_type,
      ds,
      prov
    )
  }
}