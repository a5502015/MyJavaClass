import java.io.*;
class TestConsole{
  public static void main(String[] args) {
    double r = 0;
    char pass[] = new char[6];
    Console co = System.console();
    r = Double.parseDouble(co.readLine("please enter r:"));

    co.printf("r = %.2f\n\n" ,Math.PI*r*r);

    pass = co.readPassword("please enter password:");
    if(new String(pass).equals("123456")){
      co.printf("YES\n");
    }else{
      co.printf("NO\n");
    }
  }
}
