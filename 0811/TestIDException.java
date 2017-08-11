import java.util.regex.*;
import java.util.Scanner;
class IDException extends Exception{
  public IDException(){
    super("錯誤,身分證號錯誤");
  }
  public void errorMsg(){
    System.out.println("不合法的身分證號");
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
    System.out.println("清輸入姓名以及身分證字號:");
    name = sc.next();
    id = sc.next();

    try{
      checkID(id);
      System.out.println(name + "身分證號 :" + id);
    }catch(IDException ex){
      System.out.println(ex.getMessage());
      ex.errorMsg();
    }
  }
}
