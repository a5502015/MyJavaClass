import java.io.*;
import java.util.Scanner;

class WriteFile1{

	public static void main(String[] arg){
		FileOutputStream fos=null;
		String data="";
		Scanner sc=new Scanner(System.in);

		System.out.println("請輸入欲存檔內容");
		data=sc.nextLine();
		data+="\n";


		try{
			fos=new FileOutputStream("a1.txt");
			fos.write(data.getBytes());

			System.out.println("內容已寫入檔案");
		}catch(FileNotFoundException e1){
			System.out.println("錯誤:檔案不存在");
		}catch(IOException e2){
			System.out.println("錯誤:寫檔錯誤");
		}finally{

			try{
				fos.close();
			}catch(IOException e3){
				System.out.println("錯誤:關檔失敗");
			}
		}

	}

}
