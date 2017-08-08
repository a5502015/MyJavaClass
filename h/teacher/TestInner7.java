class Health2{
	static class Bmi{
		private double weight,height;
	
		public Bmi(){}
		
		public Bmi(double w,double h){
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
		
		
		public double getValue(){
			return weight/height/height;
		}
		
		public String status(){
			double bmi=getValue();
			
			return bmi>24 ? "�L��" : bmi<18.5 ? "�L��" : "�з�";
		}
	
	}
	
	static class StdWeight{
		private double weight,height;
	
		public StdWeight(){}
		
		public StdWeight(double w,double h){
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
		
		
		public double getValue(){
			return height*height*22;
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
			return weight>max() ? "�L��" : weight<min() ? "�L��" : "�з�";
		}
	
	}
}

class TestInner7{
	public static void main(String[] arg){
		Health2.Bmi body1=new Health2.Bmi(70,1.7);
		System.out.println("�魫:" + body1.getWeight() + "����");
		System.out.println("����:" + body1.getHeight() + "����");
		System.out.println("BMI��:" + body1.getValue());
		System.out.println("�魫���A:" + body1.status());
		System.out.println("--------");
		Health2.StdWeight body2=new Health2.StdWeight(70,1.7);
		System.out.println("�魫:" + body2.getWeight() + "����");
		System.out.println("����:" + body2.getHeight() + "����");
		System.out.println("�з��魫�d��:" + body2.min() + " ~ " + body2.max() + "����" );
		System.out.println("�魫���A:" + body2.status());
	
	}
}