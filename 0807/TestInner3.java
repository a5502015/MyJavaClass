class Outer3{
  public void method1(){
    int a = 10;//�Y�O�����ϰ����O�n�ϥΦ��ܼ� �Ыŧi��final java8 �|���A�۰ʫŧi 
    System.out.println("outside method1()");

    class Inner3{
      public void method1(){
        System.out.println("inside method1()");
        System.out.println("�~��method1���ϰ��ܼ�" + a);//�u��o�˼g
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
