class Job1 implements Runnable{
    int i;
  public void run(){

    for(;i<26;i++){
      System.out.println(Thread.currentThread().getName() + "搬了第" + i + "包水泥");
    }
  }
}


class TestThread3{
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Job1 j1 = new Job1();
    Job2 j2 = new Job2();
    Thread t1 = new Thread(j1);
    Thread t2 = new Thread(j1,"2222222222");

    t1.setName("1111111111");

    t1.start();
    t2.start();

    //j1.run();
  }
}
