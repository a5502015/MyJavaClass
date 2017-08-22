import java.text.*;
import java.util.*;

class TestDate{
  public static void main(String[] args) {
    Date d1 = new Date();
    System.out.println(d1);
    System.out.println(d1.toString());
    System.out.println(d1.getTime());
    System.out.println("===================");
    DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
    System.out.println(df1.format(d1));
    System.out.println("===================");
    DateFormat df2 = new SimpleDateFormat("EE-MM-dd-YYYY");
    System.out.println(df2.format(d1));
    System.out.println("===================");
    DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT,new Locale("en","US"));
    System.out.println(df3.format(d1));
    System.out.println("===================");
    DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT,new Locale("zh","TW"));
    System.out.println(df4.format(d1));
    System.out.println("===================");
    System.out.println("===================");
    System.out.println("===================");
    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("jp","JP"));
    System.out.println(nf.format(1000000));
  }
}
