import java.io.*;

class ReadObj{
	public static void main(String[] arg){
		Rectangle r1=null;
		
		try( FileInputStream fis=new FileInputStream("rect.ser");
			 ObjectInputStream ois=new ObjectInputStream(fis);  ){
		
			r1=(Rectangle)ois.readObject();
			
			System.out.println("從rect.ser讀取");
			
			System.out.println("矩形長:" + r1.len);
			System.out.println("矩形寬:" + r1.width);
			System.out.println("矩形面積:" + r1.area());
		}catch(ClassNotFoundException e1){
			System.out.println("錯誤:類別檔不存在");		
		}catch(FileNotFoundException e1){
			System.out.println("錯誤:檔案不存在");
		}catch(IOException e2){
			System.out.println("錯誤:讀檔錯誤");
		}
	}

}