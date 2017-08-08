interface Round{
	Round setRadius(double r);
	void showResult();
	double Area();
}

class TestInner8{

	public static void main(String[] arg){
		Round ball=new Round(){
			double r;
			
			public Round setRadius(double r){
				if(r>0){
					this.r=r;
				}
				
				return this;
			}
			
			public double Area(){
				return 4.0/3.0*Math.PI*r*r*r;
			}
			
			
			public void showResult(){
				System.out.println("�y�b�|:" + r);
				System.out.println("�y��n:" + Area());
			}
		
		};
		
		ball.setRadius(19.8).showResult();
		
		System.out.println("----");
		
		new Round(){
			double r;
			
			public Round setRadius(double r){
				if(r>0){
					this.r=r;
				}
				
				return this;
			}
			
			public double Area(){
				return 4.0/3.0*Math.PI*r*r*r;
			}
			
			
			public void showResult(){
				System.out.println("�y�b�|:" + r);
				System.out.println("�y��n:" + Area());
			}
		
		}.setRadius(10.5).showResult();
	
	}

}