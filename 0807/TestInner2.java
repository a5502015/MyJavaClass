class Outer2{
  static int sa = 10;//�~���R�A�ݩ��ܼ�
  int a = 20;//�~���ݩ��ܼ�
  public void method1(){
    System.out.println("out method1()");
  }
  static class Inner2{
    int a = 30;//�����ݩ��ܼ�
    static int sa = 70;
    //static int sa = 50;
    /*
    TestInner2.java:9: error: Illegal static declaration in inner class Outer2.Inner
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
      System.out.println("�~���R�A�ݩ��ܼ�" + Outer2.sa);
      System.out.println("�����R�A�ݩ��ܼ�" + sa);
      //System.out.println("�~���ݩ��ܼ�" + Outer2.this.a);
    }
    public static void method2(){
      int a = 40; //�ϰ��ܼ�

      System.out.println("inside static method2()");
      System.out.println("�ϰ��ܼ�" + a);
      //System.out.println("�����ݩ��ܼ�" + this.a);
      System.out.println("�~���R�A�ݩ��ܼ�" + Outer2.sa);
      System.out.println("�����R�A�ݩ��ܼ�" + sa);
      //System.out.println("�~���ݩ��ܼ�" + Outer2.this.a);
    }
  }
}

class TestInner2{
  public static void main(String[] args) {
    Outer2.Inner2 in = new Outer2.Inner2();
    in.method1();
    in.method2();
    new Outer2.Inner2().method1();
    System.out.println("Outer2.sa " + Outer2.sa);
    System.out.println("Outer2.Inner2.sa " + Outer2.Inner2.sa);
    Outer2.Inner2.method2();
  }
}
