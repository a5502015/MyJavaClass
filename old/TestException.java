import java.util.*;

class TestException{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int one = 0, two = 0, div = 0, mod = 0;

    try{
      System.out.println("�п�J�Q����");
      one = sc.nextInt();

      System.out.println("�п�J����");
      two = sc.nextInt();
    }catch(InputMismatchException e3){
      System.out.println(e3.getMessage());
    }
    /*
    if(two != 0){
      div = one/two;
      mod = one%two;

      System.out.println(one + "/" + two + "=" + div + "..." + mod);
    }else{
      System.out.println("���Ƥ��o���s");
      //���`���B�z��k
    }*/
    /*
    div = one/two;
    mod = one%two;

    System.out.println(one + "/" + two + "=" + div + "..." + mod);
    */
    /*
    Exception in thread "main" java.lang.ArithmeticException: / by zero
        at TestException.main(TestException.java:21)
    */
    try{

      div = one/two;
      mod = one%two;
    }/*catch(Exception e2){
      System.out.println("�t�ο��~ :" + e2.getMessage());
    }*/
    /*
    C:\workspace>javac TestException.java
    TestException.java:39: error: exception ArithmeticException has already been caught
  catch(ArithmeticException e){
  ^
    */
    catch(ArithmeticException e){
      System.out.println("�t�ο��~ :" + e.getMessage());
      System.out.println("���~��] : ���Ƭ�0");
    }catch(Exception e2){
      System.out.println("�t�ο��~ :" + e2.getMessage());
    }finally{
      System.out.println(one + "/" + two + "=" + div + "..." + mod);
    }
  }
}
