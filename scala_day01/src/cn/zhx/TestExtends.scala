package cn.zhx

class TestExtends {
  
}

class Teacher( name:String,age:Int){
  
  val major:String = "Math"
  
  println("父类构造器已经执行了。。。。。")
}

class CollageTeacher(name:String,age:Int,school:String) extends Teacher(name,age){
  
  println("子类构造器已经执行了。。。。。。。")
  
  //覆盖写父类中的成员变量
  override val major:String = "highMath"
  
  //覆写父类中的成员方法
  override def toString:String = {
    "覆写父类当中的成员方法"
  }
}

object Runner{
  
    def main(args: Array[String]): Unit = {
      var ss = new CollageTeacher("ss",78,"清华")
      println(ss.toString())
      println(ss.major)
    }
}