import  java.net.*;
import  java.io.*;
public class SimpleServer{
	public static void main(String[] arg){
	ServerSocket  s= null;
	try{
		s=new  ServerSocket(5432);
	}catch(IOException e){
		e.printStackTrace();
	}

	while(true){
		try{
			System.out.println("等待client端的連線");
			Socket s1=s.accept();
			OutputStream slout= s1.getOutputStream();
			BufferedWriter bw=new  BufferedWriter(new OutputStreamWriter(slout));
			bw.write("Hello Net  World!\n");
			bw.close();
			s1.close();
			System.out.println("client連線結束");
		}catch(IOException e){
			e.printStackTrace();
			}
		}
	}
}
