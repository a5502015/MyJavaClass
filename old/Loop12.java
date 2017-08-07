class Loop12{
  public static void main(String[] args) {
    int i=1;

    while(i<=5){

      if(i==3){
        i++;
        continue;
      }

      System.out.println(i);
      i++;
    }
    /*
    for(i=1;i<=5;i++){
      if(i==3)
        continue;
      System.out.println(i);
    }
*/
  }

}
