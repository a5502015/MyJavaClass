import java.util.Properties;
import java.io.*;

class TestProp{

	public static void main(String[] arg){
		Properties prop=new Properties();
		FileInputStream fis=null;
		
		
		try{
			fis=new FileInputStream("a1.properties");
			prop.load(fis);
			
			System.out.println("主機名稱:" + prop.getProperty("hostName"));
			System.out.println("使用者名稱:" + prop.getProperty("userName"));
			System.out.println("密碼:" + prop.getProperty("password"));
			
		
		}catch(IOException e){
			System.out.println("檔案不存在..");
			
		}
		
		
	}
}