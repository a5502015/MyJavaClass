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

    System.out.println("a有" + a.length + "個");
    System.out.println("b有" + b.length + "個");
    System.out.println("c有" + c.length + "個");
    System.out.println("c[0]有" + c[0].length + "個");
    System.out.println("c[1]有" + c[1].length + "個");
    System.out.println("c[2]有" + c[2].length + "個");
    System.out.println("d有" + d.length + "個");
    System.out.println("d[0]有" + d[0].length + "個");
    System.out.println("d[1]有" + d[1].length + "個");
    System.out.println("d[2]有" + d[2].length + "個");

    System.out.println("a的元素");
    for(i=0;i<a.length;i++){
      System.out.print(a[i] + "\t");
    }
    System.out.println("\nb的元素");
    for(i=0;i<b.length;i++){
      System.out.print(b[i] + "\t");
    }
    System.out.println("\nc的元素");
    for(i=0;i<c.length;i++){
      for(j=0;j<c[i].length;j++){
        System.out.print(c[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println("\nd的元素");
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
    System.out.println("\n把10填入b");
    Arrays.fill(b,10);
    for(int temp:b){
      System.out.print(temp+ "\t");

    }

    System.out.println("\nc的元素值");

    for(int []arr:c){
      for(int temp:arr){
        System.out.print(temp + "\t");
      }
      System.out.println();
    }
    //System.out.println(x);
  }

}
