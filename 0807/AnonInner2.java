interface Round{
  Round setRadius(double r);
  void showResult();
  double Area();
}
class Circle2 implements Round{
  double r;
  public Round setRadius(double r){
    if(r>0){
      this.r=r;
    }
    return this;
  }
  public double Area(){
    return Math.PI*r*r;
  }
  public void showResult(){
    System.out.println("r = " + r);
    System.out.println("Area = " + Area());
  }
}

class AnonInner2{
  public static void main(String[] args) {
    Round xobj = new Round(){
      double r;
      public Round setRadius(double r){
        if(r>0){
          this.r=r;
        }
        return this;
      }
      public double Area(){
        return Math.PI*r*r;
      }
      public void showResult(){
        System.out.println("r = " + r);
        System.out.println("Area = " + Area());
      }
    };
  //  Round tmp = xobj.setRadius(10);
    //xobj.showResult();
    //tmp.showResult();
    xobj.setRadius(10).showResult();// !!!

    new Round(){
      double r;
      public Round setRadius(double r){
        if(r>0){
          this.r=r;
        }
        return this;
      }
      public double Area(){
        return Math.PI*r*r;
      }
      public void showResult(){
        System.out.println("r = " + r);
        System.out.println("Area = " + Area());
      }
    }.setRadius(19.8).showResult();//匿名類別的匿名變數
  }
}
