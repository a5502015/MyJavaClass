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
			System.out.println("����client�ݪ��s�u\n");
			Socket s1=s.accept();
			InputStream is=s1.getInputStream();
			InputStreamReader  isr= new  InputStreamReader(is);
			BufferedReader br=new  BufferedReader(isr);
			System.out.println(" Client�ݪ��T��:" + br.readLine() + "\n");
			br.close();
			s1.close();
			System.out.println("client�s�u����....\n");
		}catch(IOException e){
			e.printStackTrace();
			}
		}
	}
}
