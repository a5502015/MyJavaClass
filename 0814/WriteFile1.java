import java.io.*;
import java.util.Scanner;

class WriteFile1{

	public static void main(String[] arg){
		FileOutputStream fos=null;
		String data="";
		Scanner sc=new Scanner(System.in);

		System.out.println("�п�J���s�ɤ��e");
		data=sc.nextLine();
		data+="\n";


		try{
			fos=new FileOutputStream("a1.txt");
			fos.write(data.getBytes());

			System.out.println("���e�w�g�J�ɮ�");
		}catch(FileNotFoundException e1){
			System.out.println("���~:�ɮפ��s�b");
		}catch(IOException e2){
			System.out.println("���~:�g�ɿ��~");
		}finally{

			try{
				fos.close();
			}catch(IOException e3){
				System.out.println("���~:���ɥ���");
			}
		}

	}

}
