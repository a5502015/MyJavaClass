import java.util.Scanner;
class Test26{
	public static void main(String[] arg){
		int score = 0;
		int clas;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("please enter your score:");
			score = sc.nextInt();
		}while(score<0||score>100); //do - while 可以拿來檢查使用者輸入的值 !! 好用!!


		clas = score/10;
		//clas = clas%10;
		switch(clas){
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");

		}

	}

}
