import java.io.*;

class ReadObj{
	public static void main(String[] arg){
		Rectangle r1=null;
		
		try( FileInputStream fis=new FileInputStream("rect.ser");
			 ObjectInputStream ois=new ObjectInputStream(fis);  ){
		
			r1=(Rectangle)ois.readObject();
			
			System.out.println("�qrect.serŪ��");
			
			System.out.println("�x�Ϊ�:" + r1.len);
			System.out.println("�x�μe:" + r1.width);
			System.out.println("�x�έ��n:" + r1.area());
		}catch(ClassNotFoundException e1){
			System.out.println("���~:���O�ɤ��s�b");		
		}catch(FileNotFoundException e1){
			System.out.println("���~:�ɮפ��s�b");
		}catch(IOException e2){
			System.out.println("���~:Ū�ɿ��~");
		}
	}

}