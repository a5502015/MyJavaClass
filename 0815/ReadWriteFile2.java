import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

class ReadWriteFile2{
	public static void main(String[] arg){
		Path p1=Paths.get("c:/aa/aa8.txt");
		String data="Animal\nCat\nDog\nTiger\n";
		
		try(BufferedWriter bw=Files.newBufferedWriter(p1,Charset.defaultCharset())){
			bw.write(data);
			System.out.println("內容已寫入" + p1);
		
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
		
		try(BufferedReader br=Files.newBufferedReader(p1,Charset.defaultCharset())){
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