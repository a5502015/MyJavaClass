import java.io.*;

class WriteObj{
	public static void main(String[] arg){
		Rectangle r1=new Rectangle(10,20);
		
		try( FileOutputStream fos=new FileOutputStream("rect.ser");
			 ObjectOutputStream oos=new ObjectOutputStream(fos);  ){
		
			oos.writeObject(r1);
			
			System.out.println("將r1物件寫入rect.ser");
		}catch(FileNotFoundException e1){
			System.out.println("錯誤:檔案不存在");
		}catch(IOException e2){
			System.out.println("錯誤:寫檔錯誤");
		}
	}

}