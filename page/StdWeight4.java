package health.std;
import health.bmi.Health;

public class StdWeight4 extends Health{
	
	public StdWeight4(){}
	
	public StdWeight4(double wt,double ht){
		super(wt,ht);
	}
	
	public double getValue(){
		return super.getHeight()*super.getHeight()*22;
	}
	
	public double min(){
		double std=getValue();
		return std-std*0.1;
	}
	
	public double max(){
		double std=getValue();
		return std+std*0.1;
	}
	
	public String status(){		
		return super.getWeight()>max() ? "過重" : super.getWeight()<min() ? "過輕" : "標準";
	}
	
	
}