abstract class Health{

	private double weight,height;

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


class Bmi4 extends Health{



	public Bmi4(){}

	public Bmi4(double w,double h){
		super(w,h);
	}



	public double getValue(){
		return super.getWeight()/super.getHeight()*super.getHeight();
	}

	public String status(){
		double bmi=getValue();

		return bmi>24 ? "過重" : bmi<18.5 ? "過輕" : "標準";
	}

}


class StdWeight4 extends Health{

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

class TestBmi4{
	public static void main(String[] arg){
		Health body1=new Bmi4(70,1.7);
		System.out.println("體重:" + body1.getWeight() + "公斤");
		System.out.println("身高:" + body1.getHeight() + "公尺");
		System.out.println("BMI值:" + body1.getValue());
		System.out.println("體重狀態:" + body1.status());

		System.out.println("--------");
		body1=new StdWeight4(70,1.7);
		System.out.println("體重:" + body1.getWeight() + "公斤");
		System.out.println("身高:" + body1.getHeight() + "公尺");
		System.out.println("標準體重範圍:" + ((StdWeight4)body1).min() + " ~ " + ((StdWeight4)body1).max() + "公斤" );
		System.out.println("體重狀態:" + body1.status());

	}

}
