import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;


class ShowDir2 implements FileVisitor<Path>{

	public FileVisitResult preVisitDirectory(Path dir,BasicFileAttributes attrs) throws IOException{
		//System.out.println("資料夾:" + dir);
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult postVisitDirectory(Path dir,IOException exc) throws IOException{
	
		return FileVisitResult.CONTINUE;
	}
	
	public FileVisitResult visitFile(Path file,BasicFileAttributes attrs) throws IOException{
		System.out.println("刪除檔案:" + file);
		Files.deleteIfExists(file);
		return FileVisitResult.CONTINUE;
	}
	
	public FileVisitResult visitFileFailed(Path file,IOException exc) throws IOException{
		return FileVisitResult.CONTINUE;
	}
}


class TestShowDir2{
	public static void main(String[] arg){
		Path p=Paths.get("c:\\aa\\ccc");
		
		try{
			Files.walkFileTree(p,new ShowDir2());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}