class Loop9{
	public static void main(String[] arg){
		int i,sum=0,sum1=0,sum2=0;
		/*
		for(i=1;i<=100;i++){
			switch(i%2){
				case 0:
					sum = sum+i;
					break;
				case 1:
					sum1 = sum1+i;
					break;
				default:
					sum2=0;
			}

		}
		*/
		for(i=1;i<=99;i+=2){
			sum+=i;
			sum1+=(i+1);
		}//高效能!!
		System.out.println("奇數: " + sum1 + "偶數: " + sum);
	}
}