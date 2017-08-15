import java.io.*;
import java.nio.file.*;


class ListDir1{
	public static void main(String[] arg){
		Path p1=Paths.get("c:/Windows/System32");
		
		
		try(DirectoryStream<Path> stream=Files.newDirectoryStream(p1,"*.dll")){
			System.out.println("顯示" + p1 + "資料夾下dll");
			for(Path tmp:stream){
				System.out.println(tmp);
			}
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
	}
}