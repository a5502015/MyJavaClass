class TestString6{
	public static void main(String[] arg){
		String str="Blue Shirt, Red Shirt, Green Shirt, Yellow Shirt";
		
		System.out.println(str);
		
		String[] arr=str.split(", ");
		
		System.out.println("�r����Ϋᵲ�G:");
		for(String tmp:arr){
			System.out.println(tmp);
		}
	
	}
}