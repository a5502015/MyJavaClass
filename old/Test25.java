import java.util.Scanner;

class Test25{
	public static void main(String[] arg){
		int a=0, b=0;
		Scanner sc = new Scanner(System.in);
		String exp = "";
		
		System.out.println("�п�J�Y��1[+,-,*./]�Y��2");
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
					System.out.println("���Ƥ�����0");
				}
				
				break;
			
			default:
				System.out.println("�B��l��J���~");
			
		}
		//exp = "";
	}
	
}