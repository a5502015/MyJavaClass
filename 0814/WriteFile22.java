import java.io.*;
import java.util.Scanner;

class WriteFile22{

	public static void main(String[] arg){

		String data="";
		Scanner sc=new Scanner(System.in);

		System.out.println("請輸入欲存檔內容");
		data=sc.nextLine();
		data+="\n";


		try(FileOutputStream fos=new FileOutputStream("a1.txt",true)){

			fos.write(data.getBytes());

			System.out.println("內容已寫入檔案");
		}catch(FileNotFoundException e1){
			System.out.println("錯誤:檔案不存在");
		}catch(IOException e2){
			System.out.println("錯誤:寫檔錯誤");
		}

	}

}
