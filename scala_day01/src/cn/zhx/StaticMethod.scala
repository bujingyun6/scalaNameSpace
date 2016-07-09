package cn.zhx

class StaticMethod {
  
}

object StaticMethod{
  def sum(a: Int,b: Int): Int={
    a+b;
  }
}

object StaticMethod1{
  def main(args: Array[String]): Unit = {
   /* var s = StaticMethod.sum(10,20);
    println(s)*/
  /*  var sso = multParam(1,2,6,7,12,344,45)
    println(sso);*/
   // iforElse
  //  testFor
   // testForUtil
    
    useMap
  }
  
  def multParam(x: Int*): Int = {
    for(i <- x){
      println(i)
    }
    x.sum
  }
  //if 和 else 的用法
  def iforElse = {
    val a = 12
    val b = 33
    var result = 0
   result = if (a > b) 1 else 0
   println(result)
  }
  
  //for循环    用to
  def testFor = {
    for(i <- 0 to 10 if i%2 == 0){
      println(i)
    }
  }
  
  //用for循环 用until
  def testForUtil = {
    for(i <- 0 until 10 ){
      println(i)
    }
  }
  
  // 用Map
  def useMap={
    val m = Map("jack"->23)
    var s = m.get("=jack")
    println(s)
  }
  
}