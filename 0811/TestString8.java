import java.util.Scanner;

class TestString8{
	public static void main(String[] arg){
		String title="座號,國文,英文,數學,總分";
		String score="1,78,68,73";
		int sum=0;
		Scanner sc=new Scanner(title).useDelimiter(",");

		while(sc.hasNext()){
			System.out.print(sc.next() + "\t");
		}
		System.out.println();

		sc=new Scanner(score).useDelimiter(",");
		int i=0;
		while(sc.hasNextInt()){
			int scr=sc.nextInt();
			System.out.print(scr + "\t");
			if(i!=0){

				sum+=scr;
			}
			i++;
		}

		System.out.println(sum);

	}

}
