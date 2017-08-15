import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import static java.nio.file.StandardOpenOption.*;
import static java.nio.file.LinkOption.*;
import java.util.*;

class ReadWriteFile1{
	public static void main(String[] arg){
		
		Path p1=Paths.get("c:/aa/aa7.txt");
		List<String> lines=new ArrayList<>();
		lines.add("apple");
		lines.add("banana");
		lines.add("orange");
		lines.add("pineapple");
		lines.add("waterapple");
		
		try{
			if(!Files.exists(p1)){
				System.out.println("內容已寫入" + p1);
				Files.write(p1,lines,Charset.defaultCharset(),CREATE,TRUNCATE_EXISTING,WRITE);
			}
			
			System.out.println(p1 + "檔案內容:");
			List<String> tmp=Files.readAllLines(p1,Charset.defaultCharset());
			
			for(String str:tmp){
				System.out.println(str);
			}
		
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
		
		
		
	}
}