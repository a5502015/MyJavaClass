import java.io.*;
import java.util.Scanner;

class WriteFile3{

	public static void main(String[] arg){

		String data="";
		Scanner sc=new Scanner(System.in);

		System.out.println("�п�J���s�ɤ��e");
		data=sc.nextLine();
		data+="\n";


		try(FileOutputStream fos=new FileOutputStream("a1.txt",true);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw)){
			//fos.write(data.getBytes());
			bw.write();
			System.out.println("���e�w�g�J�ɮ�");
		}catch(FileNotFoundException e1){
			System.out.println("���~:�ɮפ��s�b");
		}catch(IOException e2){
			System.out.println("���~:�g�ɿ��~");
		}

	}

}
