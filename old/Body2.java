class BMI{
  private double wig, hig;
  public BMI(){}
  public BMI(double w,double h){
    setwig(w);
    sethig(h);
  }
  public void setwig(double w){
    if(w>=35)
      wig = w;
    else
      System.out.println("�魫�n�W�L35kg");
  }
  public void sethig(double h){
    if(h>=90)
      hig = h;
    else
      System.out.println("������J���~");
  }
  public double getwig(){
    return wig;
  }
  public double gethig(){
    return hig;
  }
  public double getValue(){
    double bmi;
    if(wig==0||hig==0){
      System.out.println("�魫��J���~�άO������J���~");
      return -1.0;
    }

    bmi = wig/((hig/100)*(hig/100));
    return bmi;
  }
  public String state(){
    double bmi = calBMI();
    if(bmi==-1.0)
      return "error!!";

    if(bmi>24){
      return "�L��";
    }else if(bmi<18.5){
      return "�L��";
    }else{
      return "���`";
    }
  }
}

class Body2{
  public static void main(String[] args) {
    BMI b = new BMI(20,89);
    System.out.println(b.getValue());
    System.out.println(b.state());
    b.setwig(70);
    b.sethig(175);
    System.out.println(b.getValue());
    System.out.println(b.state());

  }
}
