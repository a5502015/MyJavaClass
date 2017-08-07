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

    System.out.println("請輸入矩型長寬 EX :10 20");
    n.len = sc.nextInt();
    n.wid = sc.nextInt();

    System.out.println("請輸入立方體長寬 EX :10 20 30");
    c.len = sc.nextInt();
    c.wid = sc.nextInt();
    c.hig = sc.nextInt();

    System.out.println("矩型面積 = " + n.Area());
    System.out.println("立方體體積 = " + c.Area());
  }
}
