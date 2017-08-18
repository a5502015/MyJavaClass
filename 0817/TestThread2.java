class Work1 extends Thread{
  public void run(){
    int i;
    for(i=0;i<26;i++){
      System.out.println(Thread.currentThread().getName() + "搬了第" + i + "包水泥");
    }
  }
}

class Work2 extends Thread{
  public void run(){
    int i;
    for(i=0;i<26;i++){
      System.out.println(Thread.currentThread().getName() + "搬了第" + i + "包磚頭");
    }
  }
}
class TestThread2{
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    Work1 j1 = new Work1();
    Work1 j2 = new Work1();
    Work2 j3 = new Work2();
    System.out.println("j1 working :" + j1.isAlive());
    System.out.println("j2 working :" + j2.isAlive());
    System.out.println("j3 working :" + j3.isAlive());
    //Thread t1 = new Thread(j1);
    //Thread t2 = new Thread(j1,"2222222222");
    //Thread t3 = new Thread(j2,"3333333333");
    j1.setName("1111111111");
    j2.setName("2222222222");
    j3.setName("3333333333");
    j1.setPriority(1);
    j2.setPriority(5);
    j3.setPriority(10);
    j1.start();
    j2.start();
    j3.start();
    System.out.println("j1 working :" + j1.isAlive());
    System.out.println("j2 working :" + j2.isAlive());
    System.out.println("j3 working :" + j3.isAlive());

    try{
      Thread.sleep(1000);
    }catch(InterruptedException IE){
      System.out.println(IE);
    }
    System.out.println("j1 working :" + j1.isAlive());
    System.out.println("j2 working :" + j2.isAlive());
    System.out.println("j3 working :" + j3.isAlive());
    //j1.run();
  }
}
