class TestEnum3{
	enum Week{
		Sunday("�P����","T Shirt" ,0.9),
		Monday("�P���@","�Ǥl" ,0.5),
		Tuesday("�P���G","�~�M" ,0.8),
		Wednesday("�P���T","T Shirt" ,0.85),
		Thursday("�P���|","�~�M" ,0.9),
		Friday("�P����","�Ǥl" ,0.75),
		Saturday("�P����","T Shirt" ,0.9);
	
		private String wk,pname;
		private double prc;
		
		private Week(String wk,String pn, double prc){
			this.wk=wk;
			this.pname=pn;
			this.prc=prc;
		}
		
		public String showResult(){
			return wk + pname + "��" + prc + "��";
		}
		
	}
	
	
	public static void main(String[] arg){
		for(Week tmp:Week.values()){
			System.out.println(tmp.showResult());
		}
	}

}