import java.util.Properties;
import java.io.*;

class TestProp{

	public static void main(String[] arg){
		Properties prop=new Properties();
		FileInputStream fis=null;
		
		
		try{
			fis=new FileInputStream("a1.properties");
			prop.load(fis);
			
			System.out.println("�D���W��:" + prop.getProperty("hostName"));
			System.out.println("�ϥΪ̦W��:" + prop.getProperty("userName"));
			System.out.println("�K�X:" + prop.getProperty("password"));
			
		
		}catch(IOException e){
			System.out.println("�ɮפ��s�b..");
			
		}
		
		
	}
}