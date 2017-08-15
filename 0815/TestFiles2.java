import java.io.*;
import java.nio.file.*;

class TestFiles2{
  public static void main(String[] args) {
    Path p1 = Paths.get("c:/aa/aa4.txt");
    Path p2 = Paths.get("c:/aa/ddd");
    Path p3 = Paths.get("c:/aa/ddd/dddd/ddddd");
    Path p4 = Paths.get("c:/aa/aaa/aaa3.txt");
    Path scr1 = Paths.get("c:/aa/f1.jpg");
    Path det1 = Paths.get("c:/aa/bbb/f1.jpg");
    Path src2 = Paths.get("c:/aa/aa1.txt");
    Path det2 = Paths.get("c:/aa/bbb/aa1.txt");
    try{
      if(!Files.exists(p1)){
        Files.createFile(p1);
        System.out.println("�ɮ׫إߦ��\!!");
      }
      if(!Files.exists(p2)){
        Files.createDirectory(p2);
        System.out.println("�ؿ��إߦ��\!!");
      }
      if(!Files.exists(p3)){
        Files.createDirectories(p3);
        System.out.println("�ؿ��إߦ��\!!");
      }
      if(Files.exists(p4)){

        System.out.println(p4 + "�O�_�R�����\ " +  Files.deleteIfExists(p4));
      }
      if(Files.exists(scr1)&& !Files.exists(det1)){
        Files.copy(scr1,det1);
        System.out.println("�N " + scr1 + " �ƻs�� " + det1);
      }
      if(Files.exists(src2)&& !Files.exists(det2)){
        Files.move(src2,det2);
        System.out.println("�N " + src2 + " �ƻs�� " + det2);
      }
    }catch(IOException e1){
      System.out.println(e1);
    }catch(Exception e2){

    }
  }
}
