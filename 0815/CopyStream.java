import java.io.*;
import java.nio.file.*;
import java.net.*;
import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.LinkOption.*;

class CopyStream{
	public static void main(String[] arg){
		Path p1=Paths.get("c:/aa/oracle.html");
		URI uri=URI.create("https://www.oracle.com");
		
		try(InputStream ins=uri.toURL().openStream()){
			Files.copy(ins,p1,REPLACE_EXISTING);
			System.out.println("複製oracle網站首頁至" + p1);
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
	}
}