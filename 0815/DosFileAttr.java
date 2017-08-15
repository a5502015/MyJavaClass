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
			System.out.println(p1 + "檔案建立時間:" + attrs.creationTime());
			System.out.println(p1 + "檔案最後修改時間:" + attrs.lastModifiedTime());
			System.out.println(p1 + "檔案最後存取時間:" + attrs.lastAccessTime());
			System.out.println(p1 + "是否有 保存屬性:" + attrs.isArchive());
			System.out.println(p1 + "是否有 隱藏屬性:" + attrs.isHidden());
			System.out.println(p1 + "是否有 唯讀屬性:" + attrs.isReadOnly());
			System.out.println(p1 + "是否有 系統屬性:" + attrs.isSystem());
			//設定隱藏屬性
			Files.setAttribute(p1,"dos:hidden",true);
			System.out.println(p1 + "是否有 隱藏屬性:" + attrs.isHidden());
		}catch(Exception e2){
			System.out.println(e2.getMessage());
		}
	}
}