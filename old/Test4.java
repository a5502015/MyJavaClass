class Test4{
	public static void main(String[] arg){
		//System.out.println(2200000000);
		/*
		Test4.java:3: error: integer number too large: 2200000000
                System.out.println(2200000000);
                                   ^
		*/
		System.out.println(2200000000L);
		
		long a=2200000000L;
		System.out.println(a);
		
		//float b=12.5;
		float b=12.5F;
		float c=(float)12.5;
		System.out.println(b);
		System.out.println(c);
		
		byte d=10,e=117;
		//byte f=d+e;
		byte f=(byte)(d+e);
		System.out.println(f);
		
		byte g=10,h=118;
		byte i=(byte)(g+h);
		System.out.println(i);
		
	}

}