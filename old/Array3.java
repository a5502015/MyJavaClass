class Array3{
  public static void main(String[] args) {
    int i,g[] = new int[6];
    for(i=1;i<=6000;i++){
      g[(int)(Math.random()*6)]++;
      /*
      switch((int)(Math.random()*6)+1){
        case 1:
          g[0]++;
          break;
        case 2:
          g[1]++;
          break;
        case 3:
          g[2]++;
          break;
        case 4:
          g[3]++;
          break;
        case 5:
          g[4]++;
          break;
        case 6:
          g[5]++;
          break;

      }
      */

    }
    for(i=0;i<g.length;i++){
      System.out.println("骰子" + (i+1) + "出現次數" + g[i] + "次");
    }
  }
}
