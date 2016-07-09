package cn.zhx

class TestAbstract {
  
}

//定义抽象类必须要加abstract关键字
abstract class AbstractParent{
  
  //抽象类中可以定义有出事话的成员
  val name:String = "jack"
  //抽象类中可以定义未被初始化的成员
  val age:Int 
  
  //抽象类中的可以有已经实现的方法
  def sum(x:Int,y:Int):Int = x+y
  
  //抽象类中可以定义抽象方法
  def concat(a:String,b:String):String
  
  println("父类中的构造方法执行了。。。。。")
  
}

class Son extends AbstractParent{
  
  // 重写父类中的已经初始化的成员一定要加override
  override val name:String = "lili"
  //重写父类中的未初始化的成员不需要加override
  val age:Int = 89
  
  //和成员变量一样，重写父类中的非抽象方法必须要加override
  override def sum(x:Int,y:Int):Int = x+y + 10
  
  // 重写父类中的抽象方法不需要加override
  def concat(a:String,b:String):String={
    a+b+"已经重写了"
  }
  
  println("子类中的构造方法已经执行了")
  
}

object test{
  def main(args: Array[String]): Unit = {
    var ss = new Son
    println(ss.sum(12, 22))
    println(ss.concat("897", "jiujgoi"))
  }
}

