package cn.zhx

class HelloWorld {
  
}


object HelloWorld{
  def main(args: Array[String]): Unit = {
    println("Hello world");
    print(ss(5,7));
  }
  
  def ss(a: Int,b: Int): Int = {
     a+b;
  } 
}