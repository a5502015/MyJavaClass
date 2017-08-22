import java.util.*;
class ChoiceLang{
  public static void showMenu(Locale loc){
    ResourceBundle rb = ResourceBundle.getBundle("MessageBundle",loc);
    System.out.println("1." + rb.getString("menu1"));
    System.out.println("2." + rb.getString("menu2"));
    System.out.println("3." + rb.getString("menu3"));
    System.out.println("4." + rb.getString("menu4"));
    System.out.println();
  }

  public static void main(String[] args) {
    //Locale ct;
    int chi = 0;
    Scanner sc = new Scanner(System.in);
    while(chi!=3){
      System.out.println("select language");
      System.out.println("1.English");
      System.out.println("2.Chinese");
      System.out.println("3.Exit");
      System.out.print("choice :");
      chi = sc.nextInt();
      switch(chi){
        case 1:
          showMenu(new Locale("en","US"));
          break;
        case 2:
          showMenu(new Locale("zn","TW"));
          break;
        case 3:
          System.out.println("bye~~");
          break;
        default:
          System.out.println("ERROR!!!!");
      }
    }

  }
}
