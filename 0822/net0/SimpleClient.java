import  java.net.*;
import  java.io.*;
public class SimpleClient{
	public static void main(String[]  args){
		try{
			Socket s1=new Socket("127.0.0.1",5432);
			InputStream is=s1.getInputStream();
			InputStreamReader  isr= new  InputStreamReader(is);
			BufferedReader br=new  BufferedReader(isr);
			System.out.println(br.readLine());
			br.close();
			s1.close();
		}catch(ConnectException connExc){
			System.out.println("Could not connect");
		}catch(Exception  e){
			e.printStackTrace();
		}
	}
}
