import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;


class ShowDir3 extends  SimpleFileVisitor<Path>{

	public FileVisitResult preVisitDirectory(Path dir,BasicFileAttributes attrs) throws IOException{
		System.out.println("¸ê®Æ§¨:" + dir);
		return FileVisitResult.CONTINUE;
	}

	
	
	public FileVisitResult visitFile(Path file,BasicFileAttributes attrs) throws IOException{
		System.out.println("ÀÉ®×:" + file);
		return FileVisitResult.CONTINUE;
	}
	
	
}


class TestShowDir3{
	public static void main(String[] arg){
		Path p=Paths.get("c:\\aa");
		
		try{
			Files.walkFileTree(p,new ShowDir3());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}