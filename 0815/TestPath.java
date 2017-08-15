import java.io.*;
import java.nio.file.*;

class TestPath{
	public static void main(String[] arg){
		
		Path p1=Paths.get("c:\\aa\\aa1.txt");
		System.out.println("�ɦW:" + p1.getFileName());
		System.out.println("���h���|:" + p1.getParent());
		System.out.println("��Ƨ����h��:" + p1.getNameCount());
		System.out.println("�ڥؿ�:" + p1.getRoot());
		System.out.println(p1.toAbsolutePath() + "�O?����|:" + p1.isAbsolute());
		System.out.println("URI���|:" + p1.toUri());
		
		Path p2=Paths.get("aa/bbb/../ccc");
		System.out.println(p2.normalize());
		
		Path p3=Paths.get("c:/aa/aaa/aaaa");
		System.out.println(p3.subpath(1,3));
		
		Path p4=Paths.get("c:/aa/aaa/aaaa");
		System.out.println(p4.resolve("aaaa1.txt"));
		
		Path p5=Paths.get("c:/aa/bbb");
		Path p6=Paths.get("c:/aa/ccc");
		System.out.println(p5.relativize(p6));
		System.out.println(p6.relativize(p5));
		
	}

}