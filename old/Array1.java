import java.util.Arrays;
class Array1{
  public static void main(String[] args) {
    int a[] = new int[]{40,20,50,10,30};
    int b[] = new int[5];
    int c[][] = new int [][]{{10,20,30},
                             {40,50,60},
                             {70,80,90}};
    int d[][] = new int[][]{new int[4],
                          new int[2],
                          new int[3]};
    int i,j;

    System.out.println("a��" + a.length + "��");
    System.out.println("b��" + b.length + "��");
    System.out.println("c��" + c.length + "��");
    System.out.println("c[0]��" + c[0].length + "��");
    System.out.println("c[1]��" + c[1].length + "��");
    System.out.println("c[2]��" + c[2].length + "��");
    System.out.println("d��" + d.length + "��");
    System.out.println("d[0]��" + d[0].length + "��");
    System.out.println("d[1]��" + d[1].length + "��");
    System.out.println("d[2]��" + d[2].length + "��");

    System.out.println("a������");
    for(i=0;i<a.length;i++){
      System.out.print(a[i] + "\t");
    }
    System.out.println("\nb������");
    for(i=0;i<b.length;i++){
      System.out.print(b[i] + "\t");
    }
    System.out.println("\nc������");
    for(i=0;i<c.length;i++){
      for(j=0;j<c[i].length;j++){
        System.out.print(c[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println("\nd������");
    for(i=0;i<d.length;i++){
      for(j=0;j<d[i].length;j++){
        System.out.print(d[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println("sort array a");
    Arrays.sort(a);
    for(int temp:a){
      System.out.print(temp+ "\t");

    }
    System.out.println("\n��10��Jb");
    Arrays.fill(b,10);
    for(int temp:b){
      System.out.print(temp+ "\t");

    }

    System.out.println("\nc��������");

    for(int []arr:c){
      for(int temp:arr){
        System.out.print(temp + "\t");
      }
      System.out.println();
    }
    //System.out.println(x);
  }

}
