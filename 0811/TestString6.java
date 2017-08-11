class TestString6{
	public static void main(String[] arg){
		String str="Blue Shirt, Red Shirt, Green Shirt, Yellow Shirt";
		
		System.out.println(str);
		
		String[] arr=str.split(", ");
		
		System.out.println("字串分割後結果:");
		for(String tmp:arr){
			System.out.println(tmp);
		}
	
	}
}