import java.util.Scanner;
class TestAssert{
  public static void main(String[] args) {
    int score = 0;
    Scanner sc = new Scanner(System.in);
    do{
      System.out.println("清輸入分數");
      score = sc.nextInt();

      assert score>=0&&score<=100: "分數錯誤";
    }while(score<0&&score>100);

    System.out.println(score + "分數 . 成成績");

    switch(score/10){
      case 10:
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
    }
  }
}
