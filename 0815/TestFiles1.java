import java.io.*;
import java.nio.file.*;

class TestFiles1{
	public static void main(String[] arg){

		Path p1=Paths.get("c:\\aa\\aa1.txt");
		Path p2=Paths.get("c:/aa/aa1_link.txt");
		try{
			Files.createSymbolicLink(p2,p1);
			System.out.println("建立捷徑..");

		}catch(IOException e1){
			System.out.println(e1.getMessage());
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}

		Path p3=Paths.get("c:\\aa\\aa1.txt");

		try{
			System.out.println(p3 + "檔案是否存在:" + Files.exists(p3));
			System.out.println(p3 + "是資料夾:" + Files.isDirectory(p3));
			System.out.println(p3 + "是檔案:" + Files.isRegularFile(p3));
			System.out.println(p3 + "是捷徑:" + Files.isSymbolicLink(p3));
			System.out.println(p3 + "可讀:" + Files.isReadable(p3));
			System.out.println(p3 + "可寫:" + Files.isWritable(p3));
			System.out.println(p3 + "可執行:" + Files.isExecutable(p3));
			System.out.println(p3 + "是隱藏檔案:" + Files.isHidden(p3));
			System.out.println(p3 + "擁有者:" + Files.getOwner(p3));
			System.out.println(p3 + "最後修改時間:" + Files.getLastModifiedTime(p3));
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}

	}
}
