import java.io.*;
import java.util.Scanner;

class WriteFile4{

	public static void main(String[] arg){

		String data="";
		Scanner sc=new Scanner(System.in);

		System.out.println("�п�J���s�ɤ��e");
		data=sc.nextLine();
		data+="\n";


		try(FileWriter fw = new FileWriter("a1.txt",true);
			BufferedWriter bw = new BufferedWriter(fw)){
			//fos.write(data.getBytes());
			bw.write(data);
			System.out.println("���e�w�g�J�ɮ�");
		}catch(FileNotFoundException e1){
			System.out.println("���~:�ɮפ��s�b");
		}catch(IOException e2){
			System.out.println("���~:�g�ɿ��~");
		}

	}

}
