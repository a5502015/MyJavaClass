class Job1 implements Runnable{
  public void run(){
    int i;
    for(i=0;i<26;i++){
      System.out.println(Thread.currentThread().getName() + "�h�F��" + i + "�]���d");
    }
  }
}
class TestThread1{
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Job1 j1 = new Job1();
    Thread t1 = new Thread(j1);
    t1.setName("JOJO-");
    t1.start();
    //j1.run();
  }
}
