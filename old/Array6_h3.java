class Array6{
	public static void main(String[] arg){
		int[] score=new int[50];
		int[] level=new int[11];


		int i,j;
		
		for(i=0;i<score.length;i++){
			score[i]=(int)(Math.random()*101);
		}
		
		for(i=0;i<score.length;i++){
			level[score[i]/10]++;
		}
		
		for(i=0;i<level.length;i++){
			System.out.println((i==0 || i==10 ? "  " : "") + i*10 + (i==10 ? "" : "~" + (i*10+9)) + "分人數:" + level[i] + "人" );
		}
		
		System.out.println();
	
		for(i=0;i<level.length;i++){
			System.out.print((i==0 || i==10 ? "  " : "") + i*10 + (i==10 ? "" : "~" + (i*10+9)) + "分人數:" );
			for(j=1;j<=level[i];j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}