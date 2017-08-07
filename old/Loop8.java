class Loop8{
	public static void main(String[] arg){
		int i,sum=0,sum1=0,sum2=0;
		
		for(i=1;i<=100;i++){
			
			if(i%2==0){
				sum = sum+i;
			}else{
				sum1 = sum1+i;
			}
		}
		System.out.println("©_¼Æ: " + sum1 + "°¸¼Æ: " + sum);
	}
}