class Outer1{
  static int sa = 10;//�~���R�A�ݩ��ܼ�
  int a = 20;//�~���ݩ��ܼ�
  public void method1(){
    System.out.println("out method1()");
  }
  class Inner1{
    int a = 30;//�����ݩ��ܼ�
    //static int sa = 50;
    /*
    TestInner1.java:9: error: Illegal static declaration in inner class Outer1.Inner
1
  static int sa = 50;
             ^
modifier 'static' is only allowed in constant variable declarations
    */
    public void method1(){
      int a = 40; //�ϰ��ܼ�
      System.out.println("inside method1()");
      System.out.println("�ϰ��ܼ�" + a);
      System.out.println("�����ݩ��ܼ�" + this.a);
      System.out.println("�~���R�A�ݩ��ܼ�" + Outer1.sa);
      System.out.println("�~���ݩ��ܼ�" + Outer1.this.a);
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
                      //�~�����ΦW����
    in2.method1();

    new Outer1().new Inner1().method1();//���~���O�ΦW����
    */
  }
}
