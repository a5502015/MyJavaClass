import java.util.Scanner;
class Calhigh{
  double an1,an2,len;
  public double hight(){
    double ans;
    ans = (len*Math.sin(Math.PI/180*an1)*len*Math.sin(Math.PI/180*an2))/Math.sin(Math.PI/180*(Math.abs(an1-an2)));
    return ans;
  }
}
class Monhigh{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Calhigh hi = new Calhigh();
    System.out.println("�п�J�⨤���ץH�Ψ⨤�Z���D�s��: �� �� ��");
    hi.an1 = sc.nextDouble();
    hi.an2 = sc.nextDouble();
    hi.len = sc.nextDouble();

    System.out.println("�� = " + hi.hight());
  }
}
