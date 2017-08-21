
/*
class Job1 implements Runnable{
	public void run(){
		int i;
		for(i=1;i<=25;i++){
			System.out.println(Thread.currentThread().getName() + "搬了第" + i + "包水泥");
		}
	}
}
*/
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class Job1 implements Runnable{
	public void run(){
		int i;
		AtomicInteger a1 = new AtomicInteger();
		for(a1.set(1);a1.get()<=25;){
			System.out.println(Thread.currentThread().getName() + "搬了第" + a1.getAndIncrement() + "包水泥");
		}
	}
}
class Job2 implements Runnable{
	public void run(){
		int i;
		for(i=1;i<=25;i++){
			System.out.println(Thread.currentThread().getName() + "搬了第" + i + "包磚頭");
		}
	}
}

class TestThread4{
	public static void main(String[] arg){
		System.out.println(Thread.currentThread().getName());
		ExecutorService pool = Executors.newCachedThreadPool();
		Job1 j1 = new Job1();
		Job2 j2 = new Job2();

		pool.submit(j1);
		pool.submit(j2);
		pool.shutdown();

		//job1.run();

		System.out.println("主程式結束");
	}
}
