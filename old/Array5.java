class Arrays{
  public static void main(String[] args) {
    if(args.length == 0){
      System.out.println("沒有輸入任何參數值");
    }else{
      int sum = 0,i;
      for (i=0;i<args.length ;i++ ) {
        System.out.print(args[i] + (i==args.length-1 ? "=" : "+"));
        sum+=Integer.parseInt(args[i]);

      }
      System.out.println(sum);
    }
  }
}
