import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.nio.file.attribute.*;
import static java.nio.file.StandardOpenOption.*;
import static java.nio.file.LinkOption.*;

class DosFileAttr{
	public static void main(String[] arg){
		Path p1=Paths.get("c:/aa/aa9.txt");
		DosFileAttributes attrs=null;
		
		try{
			attrs=Files.readAttributes(p1,DosFileAttributes.class);
			System.out.println(p1 + "�ɮ׫إ߮ɶ�:" + attrs.creationTime());
			System.out.println(p1 + "�ɮ׳̫�ק�ɶ�:" + attrs.lastModifiedTime());
			System.out.println(p1 + "�ɮ׳̫�s���ɶ�:" + attrs.lastAccessTime());
			System.out.println(p1 + "�O�_�� �O�s�ݩ�:" + attrs.isArchive());
			System.out.println(p1 + "�O�_�� �����ݩ�:" + attrs.isHidden());
			System.out.println(p1 + "�O�_�� ��Ū�ݩ�:" + attrs.isReadOnly());
			System.out.println(p1 + "�O�_�� �t���ݩ�:" + attrs.isSystem());
			//�]�w�����ݩ�
			Files.setAttribute(p1,"dos:hidden",true);
			System.out.println(p1 + "�O�_�� �����ݩ�:" + attrs.isHidden());
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
	}
}