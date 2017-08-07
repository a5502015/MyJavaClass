class Circle{
  double r;
  public Circle(){}
  public double Area(){
    return Math.PI*r*r;
  }
}
class Ball extends Circle{
  public Ball(){}
  public double Area(){
    return 4.0/3.0*super.Area()*super.r;
  }
}

class AnonInner{
  public static void main(String[] args) {
    Circle xobj = new Circle(){
      public double Area(){
        return 4.0/3.0*super.Area()*super.r;
      }
      public void method1(){
        System.out.println("test");
      }
    };//這裡跟ball一樣喔!!  這是一種子類別的撰寫方式 但是只能覆蓋或是實作父類別 -> Circle 裡面的method
      //可以擴充 但是呼叫不到!!!
    xobj.r = 10;
    System.out.println("半徑 = " + xobj.r);
    System.out.println("ball體積 = " + xobj.Area());
    //xobj.method1();//可以擴充 但是呼叫不到 也許是轉型的問題???
    /*
    AnonInner.java:28: error: cannot find symbol
    xobj.method1();
        ^
        symbol:   method method1()
        location: variable xobj of type Circle
    */
  }
}
