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
    };//�o�̸�ball�@�˳�!!  �o�O�@�ؤl���O�����g�覡 ���O�u���л\�άO��@�����O -> Circle �̭���method
      //�i�H�X�R ���O�I�s����!!!
    xobj.r = 10;
    System.out.println("�b�| = " + xobj.r);
    System.out.println("ball��n = " + xobj.Area());
    //xobj.method1();//�i�H�X�R ���O�I�s���� �]�\�O�૬�����D???
    /*
    AnonInner.java:28: error: cannot find symbol
    xobj.method1();
        ^
        symbol:   method method1()
        location: variable xobj of type Circle
    */
  }
}
