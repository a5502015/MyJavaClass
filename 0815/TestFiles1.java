import java.io.*;
import java.nio.file.*;

class TestFiles1{
	public static void main(String[] arg){

		Path p1=Paths.get("c:\\aa\\aa1.txt");
		Path p2=Paths.get("c:/aa/aa1_link.txt");
		try{
			Files.createSymbolicLink(p2,p1);
			System.out.println("�إ߱��|..");

		}catch(IOException e1){
			System.out.println(e1.getMessage());
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}

		Path p3=Paths.get("c:\\aa\\aa1.txt");

		try{
			System.out.println(p3 + "�ɮ׬O�_�s�b:" + Files.exists(p3));
			System.out.println(p3 + "�O��Ƨ�:" + Files.isDirectory(p3));
			System.out.println(p3 + "�O�ɮ�:" + Files.isRegularFile(p3));
			System.out.println(p3 + "�O���|:" + Files.isSymbolicLink(p3));
			System.out.println(p3 + "�iŪ:" + Files.isReadable(p3));
			System.out.println(p3 + "�i�g:" + Files.isWritable(p3));
			System.out.println(p3 + "�i����:" + Files.isExecutable(p3));
			System.out.println(p3 + "�O�����ɮ�:" + Files.isHidden(p3));
			System.out.println(p3 + "�֦���:" + Files.getOwner(p3));
			System.out.println(p3 + "�̫�ק�ɶ�:" + Files.getLastModifiedTime(p3));
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}

	}
}
