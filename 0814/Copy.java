import java.io.*;

class Copy{
	public static void main(String[] arg){
	
		if(arg.length!=2){
			System.out.println("�п�J�ӷ��Υئa�ɦW....");
		}else{
			byte[] data=new byte[1024];
			int len=0;
			
			try( FileInputStream fis=new FileInputStream(arg[0]);
				FileOutputStream fos=new FileOutputStream(arg[1]);  ){
			
				while((len=fis.read(data))!=-1){
					fos.write(data,0,len);
					
				}
				
				
				System.out.println("�N" +arg[0] + "�ƻs" + arg[1]);
			}catch(FileNotFoundException e1){
				System.out.println("���~:�ɮפ��s�b");
			}catch(IOException e2){
				System.out.println("���~:�g�ɿ��~");
			}
		}
	
	
	}

}