import java.util.Scanner;
class Rectangle{
  int len,wid;
  public int Area(){
    return len*wid;
  }
}
class Cube{
  int len,wid,hig;
  public int Area(){
    return len*wid*hig;
  }
}
class RectCube{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Rectangle n = new Rectangle();
    Cube c = new Cube();

    System.out.println("�п�J�x�����e EX :10 20");
    n.len = sc.nextInt();
    n.wid = sc.nextInt();

    System.out.println("�п�J�ߤ�����e EX :10 20 30");
    c.len = sc.nextInt();
    c.wid = sc.nextInt();
    c.hig = sc.nextInt();

    System.out.println("�x�����n = " + n.Area());
    System.out.println("�ߤ�����n = " + c.Area());
  }
}
