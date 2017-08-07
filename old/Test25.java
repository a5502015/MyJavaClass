import java.util.Scanner;

class Test25{
	public static void main(String[] arg){
		int a=0, b=0;
		Scanner sc = new Scanner(System.in);
		String exp = "";
		
		System.out.println("請輸入某數1[+,-,*./]某數2");
		a = sc.nextInt();
		exp = sc.next();
		b = sc.nextInt();
		
		switch(exp){
			case "+":
				System.out.println(a + "+" + b + "=" + (a+b));
				break;
			case "-":
				System.out.println(a + "-" + b + "=" + (a-b));
				break;
			case "*":
				System.out.println(a + "*" + b + "=" + (a*b));
				break;
			case "/":
				if(b!=0){
					System.out.println(a + "/" + b + "=" + (a/b) + "..." + (a%b));
					
				}else{
					System.out.println("除數不應為0");
				}
				
				break;
			
			default:
				System.out.println("運算子輸入錯誤");
			
		}
		//exp = "";
	}
	
}