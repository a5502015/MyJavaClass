import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import static java.nio.file.StandardOpenOption.*;
import static java.nio.file.LinkOption.*;

class ReadWriteFile3{
	public static void main(String[] arg){
		Path p1=Paths.get("c:/aa/aa9.txt");
		String data="Animal\nCat\nDog\nTiger\n";
		
		try(OutputStream os=Files.newOutputStream(p1,CREATE,APPEND);
			OutputStreamWriter osw=new OutputStreamWriter(os);
			BufferedWriter bw=new BufferedWriter(osw)){
			bw.write(data);
			System.out.println("內容已寫入" + p1);
		
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
		
		try(InputStream is=Files.newInputStream(p1);
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr)){
			String str="";
			
			System.out.println(p1+ "檔案內容:");
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
		
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
	}
}