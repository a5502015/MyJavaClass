import java.util.Scanner;
class h3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("請輸入兩個數字來比大小 ex : 12 30");
    int m = sc.nextInt();
    int n = sc.nextInt();

    int max = max_min.max(m,n);
    int min = max_min.min(m,n);

    System.out.println("MAX = " + max + " min = " + min);

  }
}

class max_min{
  public static int max(int m,int n){
    if(m>n)
      return m;
    else
      return n;
  }
  public static int min(int m,int n){
    if(m<n)
      return m;
    else
      return n;
  }
}
