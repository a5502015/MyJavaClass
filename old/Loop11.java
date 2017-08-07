class Loop11{//求三個衛視的阿姆斯壯數
  public static void main(String[] arg){
    int i = 100,a,b,c,sum;
    for(i=100;i<1000;i++){
      a = i/100;
      b = (i%100)/10;
      c = i%10;
      sum = a*a*a+b*b*b+c*c*c;
      if(sum==i){
        System.out.println(i);
      }
    }
  }
}
