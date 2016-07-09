package cn.zhx

class DemoMultMap {
  
}

object DemoMultMap{
  def main(args: Array[String]): Unit = {
    //multMap
    demoTuple
  }
  
//可变map
  def multMap{
    var m = scala.collection.mutable.Map("tom"->18)
    m + ("lili"->32)
    for((k,v)<-m){
      println(k + "__" + v)
    }
  }
  
  /**
   * 元组：
   * 定义
   * val tuple = (1,2,3,4)
   * 通过   ._ 取值，下标从1开始，例如  t._1
   * 
   * */
  def demoTuple = {
    val tuple = (1,2,3,4)
    for(e <- tuple.productIterator){
      println(e)
    }
  }
  
  
  
}

