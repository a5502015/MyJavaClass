import java.util.Scanner;
class Body{
  double wig,hig;
  public double BMI(){
    double bmi;
    bmi = wig/((hig/100)*(hig/100));
    return bmi;
  }
  public String wig_state(){
    double bmi = BMI();
    if(bmi>24){
      return "過重";
    }else if(bmi<18.5){
      return "過輕";
    }else{
      return "正常";
    }
  }
}
class Calbody{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Body b = new Body();
    System.out.println("請輸入體重(kg)身高(cm) EX :60 170");
    b.wig = sc.nextDouble();
    b.hig = sc.nextDouble();

    System.out.println("BMI = " + b.BMI());
    System.out.println(b.wig_state());
  }
}
