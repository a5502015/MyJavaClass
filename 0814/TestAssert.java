import java.util.Scanner;
class TestAssert{
  public static void main(String[] args) {
    int score = 0;
    Scanner sc = new Scanner(System.in);
    do{
      System.out.println("�M��J����");
      score = sc.nextInt();

      assert score>=0&&score<=100: "���ƿ��~";
    }while(score<0&&score>100);

    System.out.println(score + "���� . �����Z");

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
