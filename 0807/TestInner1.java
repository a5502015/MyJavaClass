class Outer1{
  static int sa = 10;//场繰篈妮┦跑计
  int a = 20;//场妮┦跑计
  public void method1(){
    System.out.println("out method1()");
  }
  class Inner1{
    int a = 30;//ず场妮┦跑计
    //static int sa = 50;
    /*
    TestInner1.java:9: error: Illegal static declaration in inner class Outer1.Inner
1
  static int sa = 50;
             ^
modifier 'static' is only allowed in constant variable declarations
    */
    public void method1(){
      int a = 40; //跋办跑计
      System.out.println("inside method1()");
      System.out.println("跋办跑计" + a);
      System.out.println("ず场妮┦跑计" + this.a);
      System.out.println("场繰篈妮┦跑计" + Outer1.sa);
      System.out.println("场妮┦跑计" + Outer1.this.a);
    }
  }
}

class TestInner1{
  public static void main(String[] args) {
    Outer1 out = new Outer1();
    Outer1.Inner1 in = out.new Inner1();
    out.method1();
    in.method1();
    /*
    Outer1.Inner1 in2 = new Outer1().new Inner1();
                      //场拔ン
    in2.method1();

    new Outer1().new Inner1().method1();//ず常琌拔ン
    */
  }
}
