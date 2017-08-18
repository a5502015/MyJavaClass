class Job1 implements Runnable{
  public void run(){
    int i;
    for(i=0;i<26;i++){
      System.out.println(Thread.currentThread().getName() + "搬了第" + i + "包水泥");
    }
  }
}

class Job2 implements Runnable{
  public void run(){
    int i;
    for(i=0;i<26;i++){
      System.out.println(Thread.currentThread().getName() + "搬了第" + i + "包磚頭");
    }
  }
}
class TestThread1{
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Job1 j1 = new Job1();
    Job2 j2 = new Job2();
    Thread t1 = new Thread(j1);
    Thread t2 = new Thread(j1,"2222222222");
    Thread t3 = new Thread(j2,"3333333333");
    t1.setName("1111111111");
    t1.setPriority(1);
    t2.setPriority(5);
    t3.setPriority(10);
    t1.start();
    t2.start();
    t3.start();
    //j1.run();
  }
}
