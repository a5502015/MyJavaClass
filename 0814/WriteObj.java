import java.io.*;

class WriteObj{
	public static void main(String[] arg){
		Rectangle r1=new Rectangle(10,20);
		
		try( FileOutputStream fos=new FileOutputStream("rect.ser");
			 ObjectOutputStream oos=new ObjectOutputStream(fos);  ){
		
			oos.writeObject(r1);
			
			System.out.println("�Nr1����g�Jrect.ser");
		}catch(FileNotFoundException e1){
			System.out.println("���~:�ɮפ��s�b");
		}catch(IOException e2){
			System.out.println("���~:�g�ɿ��~");
		}
	}

}