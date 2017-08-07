interface Round{
  Round setR(double r);
  void print_ans();
  double Area();
}
class Circle{
  double r;
  public Circle(){}
  public double Area(){
    return Math.PI*r*r;
  }
}

class Homework_inner_class{
  public static void main(String[] args) {
    Circle ball = new Circle(){
      public double Area(){
        return 4/3.0*Math.PI*r*r*r;
      }
    };
    ball.r = 5;
    System.out.println(ball.Area());
    System.out.println("=======================");
    new Round(){
      double r;
      public Round setR(double r){
        if(r>0)
          this.r = r;

        return this;
      }
      public void print_ans(){
        System.out.println("R = " + r);
        System.out.println("Area = " + Area());
      }
      public double Area(){
        return 4/3.0*Math.PI*r*r*r;
      }
    }.setR(10).print_ans();
  }
}
