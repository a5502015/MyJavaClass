class Loop15{
  public static void main(String[] args) {
    int i,j;
    bk:
    for(i=1;i<=4;i++){
      for(j=1;j<=4;j++){
        if(j==3)
          break bk;
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
