class Array6{
  public static void main(String[] args) {
    /*
    if(args.length==2){
      int max = Integer.parseInt(args[0]);
      if(max<(Integer.parseInt(args[1]))){
        max = Integer.parseInt(args[1]);
      }
      System.out.println("Max = " + max);
    }else{
      System.out.println("��J���~���Ѽ�");
    }
    */
    if(args.length!=2){
      System.out.println("��J���~���Ѽ�");
    }else{
      int o = Integer.parseInt(args[0]);
      int t = Integer.parseInt(args[1]);
      System.out.println(o + "," + t + " max = " + (o>=t?o:t));
    }
  }
}
