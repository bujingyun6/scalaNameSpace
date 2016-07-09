package cn.zhx

//在Scala中，类默认是public的，而且一个源文件中可以包含多个public类，
//源文件名可以与文件中定义的类名不一致
class Person(dd:Int) {
  
   val name:String = "jack"
   //在普通类中，不允许声明一个未指定值得成员变量,如果不想给真是的初始值，也必须用占位符来指定
   var age:Int = _
   
   //定义了一个私有成员变量，跟Java一样不能被外部直接访问 
   private [this] var gender:String = "male"
   
   //可以对外暴露一个私有的方法
   def getGender:String = {
     this.gender
   }
   
   def setGender(gender:String)={
     this.gender = gender
   }
   
  def sayHello(msg:String){
     println(msg)
   }
}

object p{
  def main(args: Array[String]): Unit = {
    //默认无惨构造函数，可以不用带括号
    val p = new Person(9)
    println(p.name)
    println(p.age)
    p.setGender("nonFemale")
    println(p.getGender)
  }
}