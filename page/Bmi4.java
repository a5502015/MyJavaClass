package health.bmi;

public class Bmi4 extends Health{

	
	
	public Bmi4(){}
	
	public Bmi4(double w,double h){
		super(w,h);
	}
	
	
	
	public double getValue(){
		return super.getWeight()/super.getHeight()*super.getHeight();
	}
	
	public String status(){
		double bmi=getValue();
		
		return bmi>24 ? "�L��" : bmi<18.5 ? "�L��" : "�з�";
	}

}