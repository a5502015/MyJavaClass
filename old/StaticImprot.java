import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.*;

class StaticImport{
  public static void main(String[] args) {
    double r = 0;
    Scanner sc = new Scanner (in);
    out.println("½Ð¿é¤J¥b®|");
    r = sc.nextDouble();
    out.println("¶é­±¿n = " + (PI*pow(r,2)));
  }
}
