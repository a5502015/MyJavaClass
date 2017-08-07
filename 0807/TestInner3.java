class Outer3{
  public void method1(){
    int a = 10;//若是內部區域類別要使用此變數 請宣告為final java8 會幫你自動宣告 
    System.out.println("outside method1()");

    class Inner3{
      public void method1(){
        System.out.println("inside method1()");
        System.out.println("外部method1的區域變數" + a);//只能這樣寫
        //a++;
        /*
        TestInner3.java:10: error: local variables referenced from an inner class must b
e final or effectively final
      a++;
      ^
        */
      }

    }
    Inner3 in3 = new Inner3();
    in3.method1();
  }
}

class TestInner3{
  public static void main(String[] args) {
    new Outer3().method1();
  }
}
