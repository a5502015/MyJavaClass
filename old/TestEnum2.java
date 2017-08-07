import java.util.Scanner;
class TestEnum2{
  enum Week{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
  public static void main(String[] args) {
    String str = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("請輸入星期英文");
    str = sc.next();
    System.out.print(Week.valueOf(str) + "課程");
    switch(Week.valueOf(str)){
      case Monday:
      case Wednesday:
      case Friday:
        System.out.println("C++,JAVA,photoshop");
        break;
      case Tuesday:
      case Thursday:
        System.out.println("cad,python,3D");
        break;
      case Saturday:
        System.out.println("Python,android");
        break;
      case Sunday:
        System.out.println("C#,Java");
        break;
    }
    /*
    System.out.println(Week.Sunday);
    System.out.println(Week.Monday);
    System.out.println(Week.Tuesday);
    System.out.println(Week.Wednesday);
    Week[] wk = Week.values();
    System.out.println("==========================");
    for (int i=0;i<wk.length ;i++ ) {
      System.out.println(wk[i]);
    }
    System.out.println("==========================");
    for(Week tmp: wk){
      System.out.println(tmp);
    }
    System.out.println("==========================");
    for(Week tmp: Week.values()){
      System.out.println(tmp);


    }
    System.out.println("==========================");
    System.out.println(Week.valueOf("Sunday"));
    //System.out.println(Week.Monday);
    //System.out.println(Week.Tuesday);
    //System.out.println(Week.Wednesday);
    */
  }
}
