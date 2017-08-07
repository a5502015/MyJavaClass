class TestEnum{
  enum Week{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
  public static void main(String[] args) {
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
  }
}
