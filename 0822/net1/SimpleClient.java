import  java.net.*;
import  java.io.*;
import  java.util.Scanner;
public class SimpleClient{
	public static void main(String[]  args){
		Socket s1=null;
		String msg=null;
		Scanner sc=new Scanner(System.in);
		try{
			while(true){
				s1=new Socket("192.168.1.41",5432);
				OutputStream slout= s1.getOutputStream();
				BufferedWriter bw=new  BufferedWriter(new OutputStreamWriter(slout));
				System.out.println("�п�J���ǰe���T��:");
				msg=sc.nextLine();
				bw.write(msg);
				bw.close();
				s1.close();
			}
		}catch(ConnectException connExc){
			System.out.println("Could not connect");
		}catch(Exception  e){
			e.printStackTrace();
		}
	}
}
