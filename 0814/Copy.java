import java.io.*;

class Copy{
	public static void main(String[] arg){
	
		if(arg.length!=2){
			System.out.println("請輸入來源及目地檔名....");
		}else{
			byte[] data=new byte[1024];
			int len=0;
			
			try( FileInputStream fis=new FileInputStream(arg[0]);
				FileOutputStream fos=new FileOutputStream(arg[1]);  ){
			
				while((len=fis.read(data))!=-1){
					fos.write(data,0,len);
					
				}
				
				
				System.out.println("將" +arg[0] + "複製" + arg[1]);
			}catch(FileNotFoundException e1){
				System.out.println("錯誤:檔案不存在");
			}catch(IOException e2){
				System.out.println("錯誤:寫檔錯誤");
			}
		}
	
	
	}

}