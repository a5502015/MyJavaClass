class Loop14{
  public static void main(String[] args) {
    int i;
    loop1:
    for(i=1;i<=5;i++){
      switch(i){
        case 3:
          break loop1;
      }
      System.out.println(i);
    }
  }

}
