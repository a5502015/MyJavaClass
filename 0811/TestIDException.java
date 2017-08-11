import java.util.regex.*;
import java.util.Scanner;
class IDException extends Exception{
  public IDException(){
    super("���~,�����Ҹ����~");
  }
  public void errorMsg(){
    System.out.println("���X�k�������Ҹ�");
  }
}

class TestIDException{
  public static void checkID(String sid) throws IDException{
    Pattern pt = Pattern.compile("[A-Z][1-2][0-9]{8}");
    Matcher mt = pt.matcher(sid);

    if(!mt.find()&&sid.length()!=10)
      throw new IDException();
  }

  public static void main(String[] args) {
    String name = "",id = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("�M��J�m�W�H�Ψ����Ҧr��:");
    name = sc.next();
    id = sc.next();

    try{
      checkID(id);
      System.out.println(name + "�����Ҹ� :" + id);
    }catch(IDException ex){
      System.out.println(ex.getMessage());
      ex.errorMsg();
    }
  }
}
