// 公司類別
/*
class Company
{
   private int sum = 0;
   public synchronized void add(int a)
   {
     //synchronized(this){
       System.out.println(Thread.currentThread().getName());
       int tmp = sum;
       System.out.println("目前的合計金額是" + tmp + "元。" + Thread.currentThread().getName());
       System.out.println("賺到" + a + "元了。" + Thread.currentThread().getName());
       tmp = tmp + a;
       System.out.println("合計金額是" + tmp + "元。" + Thread.currentThread().getName());
       sum = tmp;
     //}

   }
}
*/
import java.util.concurrent.locks.*;
class Company
{
   private int sum = 0;
   private final ReentrantLock rlock = new ReentrantLock();
   public/* synchronized*/ void add(int a)
   {
     //synchronized(this){
     try{
       rlock.lock();
       System.out.println(Thread.currentThread().getName());
       int tmp = sum;
       System.out.println("目前的合計金額是" + tmp + "元。" + Thread.currentThread().getName());
       System.out.println("賺到" + a + "元了。" + Thread.currentThread().getName());
       tmp = tmp + a;
       System.out.println("合計金額是" + tmp + "元。" + Thread.currentThread().getName());
       sum = tmp;
     }catch(Exception ex){
       System.out.println(ex);
     }finally{
       rlock.unlock();
     }

     //}

   }
}
// 駕駛員類別
class Driver extends Thread
{
   private Company comp;

   public Driver(Company c)
   {
      comp = c;
   }
   public void run()
   {
      for(int i=0; i<3; i++){
		      //synchronized(comp){
		          comp.add(50);
		     //}
      }
   }
}

class Sample7
{
   public static void main(String[] args)
   {
      Company cmp = new Company();

      Driver drv1 = new Driver(cmp);
      drv1.setName("Driver1");
	    drv1.start();


      Driver drv2 = new Driver(cmp);
	    drv2.setName("Driver2");
      drv2.start();
   }
}
