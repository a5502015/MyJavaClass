import java.util.StringTokenizer;
class TestString7{
	public static void main(String[] arg){
		String str="Blue Shirt, Red Shirt, Green Shirt, Yellow Shirt";
		
		System.out.println(str);
		
		StringTokenizer stk=new StringTokenizer(str,", ");
		
		System.out.println("字串分割後結果:");
		
		while(stk.hasMoreTokens()){
			System.out.println(stk.nextToken());			
		}
	
	}
}