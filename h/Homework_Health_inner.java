/*
0807 作業
Health.class 內有兩個內部類別 bmi  &   stdwig
*/
class Health{
  class bmi{
    private double weight,height;
    public bmi(){}
    public bmi(double h,double w){
      setstatu(h,w);
    }
    public void setstatu(double h,double w){
      if(h>=0.9)
        height = h;
      if(w>=35)
        weight = w;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
      return height;
    }
    public double CalBMI(){
      return getWeight()/getHeight()/getHeight();
    }
    public String status(){
		//double bmi=getValue();

		return CalBMI()>24 ? "過重" : CalBMI()<18.5 ? "過輕" : "標準";
	}
    public String toString(){
      return "weight = " + weight + " || " + "height = " + height + "\nBMI = " + CalBMI() + "  BMI狀態 = " + status();
    }
  }
  class stdwig extends bmi{
    //private double weight,height;
    public stdwig(){}
    public stdwig(double h,double w){
      super(h,w);
    }
    public double CalStdwig(){
      return super.getHeight()*super.getHeight()*22;
    }
    public double min(){
  		double std=CalStdwig();
  		return std-std*0.1;
  	}
  	public double max(){
  		double std=CalStdwig();
  		return std+std*0.1;
  	}
    public String status(){
      return super.getWeight()>max() ? "過重" : super.getWeight()<min() ? "過輕" : "標準";
    }
    public String toString(){
      return "weight = " + super.getWeight() + " || " + "height = " + super.getHeight() + "\n體重標準 = " + CalStdwig() + "  身體狀態 = " + status();
    }
  }
}

class Homework_Health_inner{
  public static void main(String[] args) {
    Health.bmi andy = new Health().new bmi(1.4,65.0);
    System.out.println(andy);
    System.out.println("=====================");
    Health.stdwig amy = new Health().new stdwig(1.7,55.0);
    System.out.println(amy);
  }
}
