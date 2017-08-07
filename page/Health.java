package health.bmi;

public abstract class Health{

	protected double weight,height;
	
	public Health(){}
	
	public Health(double w,double h){
		setWeight(w);
		setHeight(h);
	}
	
	public void setHeight(double ht){
		if(ht>=0.9){
			height=ht;
		}
	}

	public void setWeight(double wt){
		if(wt>=35){
			weight=wt;
		}
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getHeight(){
		return height;
	}
	
	
	public abstract double getValue();
	
	public abstract String status();

}