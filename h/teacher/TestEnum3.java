class TestEnum3{
	enum Week{
		Sunday("星期日","T Shirt" ,0.9),
		Monday("星期一","褲子" ,0.5),
		Tuesday("星期二","外套" ,0.8),
		Wednesday("星期三","T Shirt" ,0.85),
		Thursday("星期四","外套" ,0.9),
		Friday("星期五","褲子" ,0.75),
		Saturday("星期六","T Shirt" ,0.9);
	
		private String wk,pname;
		private double prc;
		
		private Week(String wk,String pn, double prc){
			this.wk=wk;
			this.pname=pn;
			this.prc=prc;
		}
		
		public String showResult(){
			return wk + pname + "打" + prc + "折";
		}
		
	}
	
	
	public static void main(String[] arg){
		for(Week tmp:Week.values()){
			System.out.println(tmp.showResult());
		}
	}

}