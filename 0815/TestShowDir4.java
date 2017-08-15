import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;


class ShowDir4 extends  SimpleFileVisitor<Path>{

	PathMatcher matcher;
	String pt="";
	
	public ShowDir4(String p){
		pt="glob:" + p;
		matcher=FileSystems.getDefault().getPathMatcher(pt);
	}

	
	
	public FileVisitResult visitFile(Path file,BasicFileAttributes attrs) throws IOException{
		Path p=file.getFileName();
		
		if(p!=null && matcher.matches(p)){
			System.out.println("ÀÉ®×:" + file);
		}
		return FileVisitResult.CONTINUE;
	}
	
	
}


class TestShowDir4{
	public static void main(String[] arg){
		Path p=Paths.get("c:\\Windows\\System32");
		
		try{
			Files.walkFileTree(p,new ShowDir4("*.dll"));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}