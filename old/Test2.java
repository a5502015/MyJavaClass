class Test2{

	public static void main(String[] arg){
		System.out.println(10+3);
		System.out.println(10-3);
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10%3);
		
		System.out.println("10+3=" + 10 + 3);     //��� + ���O���r��s��
		System.out.println("10+3=" + (10 + 3));
		
		//System.out.println("10+3=" + 10 - 3);
		/*
		Test2.java:13: error: bad operand types for binary operator '-'
                System.out.println("10+3=" + 10 - 3);
                                                ^
		first type:  String
		second type: int
		
		
		*/
		System.out.println("10+3=" + (10 - 3));
		System.out.println("10*3=" + 10 * 3);
		System.out.println("10/3=" + 10 / 3);
		System.out.println("10%3=" + 10 % 3);
		
		System.out.println("10.0/3.0=" + 10.0 / 3.0);
		System.out.println("10.0%3.0=" + 10.0 % 3.0);
		
		System.out.println("10>3 ���G:" + (10>3));
		System.out.println("10==3 ���G:" + (10==3));
		System.out.println("10!=3 ���G:" + (10!=3));
		
		System.out.println("10>3 �B 10>4 ���G:" + (10>3 && 10>4));
		System.out.println("10<3 �B 10>4 ���G:" + (10<3 && 10>4));
		
		System.out.println("10>3 �� 10>4 ���G:" + (10>3 || 10>4));
		System.out.println("10<3 �� 10>4 ���G:" + (10<3 || 10>4));
		
		System.out.println("�D 10>3 ���G:" + !(10>3));
		System.out.println("�D 10<3 ���G:" + !(10<3));
		System.out.println("8 & 9=" + (8&9));
		System.out.println("8 | 9=" + (8|9));
		System.out.println("8 ^ 9=" + (8^9));
		System.out.println("8 ^ 1=" + (8^1));
		System.out.println("9 ^ 1=" + (9^1));
	}
		
}