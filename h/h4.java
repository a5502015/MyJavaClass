import java.util.Scanner; // 7/25
class Nomorewig{
  double hig ,wig;
  public double nomor(){
    return ((hig/100)*(hig/100))*22;
  }
  public double max(){
    double sum;
    sum = nomor() + nomor()*0.1;
    return sum;
  }
  public double min(){
    double sum;
    sum = nomor() - nomor()*0.1;
    return sum;
  }
  public String state(){
    double m,n;
    m = max();
    n = min();
    if(wig>m)
      return "�L��";
    else if(wig<n)
      return "�L��";
    else
      return "���`";
  }
}
class h4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Nomorewig n = new Nomorewig();

    System.out.println("�п�J����(cm)�魫(kg) EX :170 60");
    n.hig = sc.nextDouble();
    n.wig = sc.nextDouble();

    System.out.println(n.state());
  }
}
