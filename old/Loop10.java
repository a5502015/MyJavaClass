class Loop10{//�D�|�~1-2017
  public static void main(String[] args) {
    int year = 0;
    int i = 0;
    for(i = 1;i<2018;i++){
      /*
      if(i%4==0 && i%100!=0 || i%400==0)
        year++;
      */
      if(i%100!=0){
        if(i%4==0){
          year++;
        }
      }else if(i%400==0){
        year++;
      }
    }
    System.out.println("1-2017�@�� :" + year + "�Ӷ|�~");
  }

}
