
/*
class Job1 implements Runnable{
	public void run(){
		int i;
		for(i=1;i<=25;i++){
			System.out.println(Thread.currentThread().getName() + "�h�F��" + i + "�]���d");
		}
	}
}
*/
import java.util.concurrent.atomic.AtomicInteger;
class Job1 implements Runnable{
	public void run(){
		int i;
		AtomicInteger a1 = new AtomicInteger();
		for(a1.set(1);a1.get()<=25;){
			System.out.println(Thread.currentThread().getName() + "�h�F��" + a1.getAndIncrement() + "�]���d");
		}
	}
}
class Job2 implements Runnable{
	public void run(){
		int i;
		for(i=1;i<=25;i++){
			System.out.println(Thread.currentThread().getName() + "�h�F��" + i + "�]�j�Y");
		}
	}
}

class TestThread{
	public static void main(String[] arg){
		System.out.println(Thread.currentThread().getName());


		Job1 job1=new Job1();
		Job2 job2=new Job2();

		Thread worker1=new Thread(job1);
		worker1.setName("�B�@");

		Thread worker2=new Thread(job1,"���G");
		Thread worker3=new Thread(job2,"�i�T");

		worker1.setPriority(3);
		worker2.setPriority(10);
		worker3.setPriority(1);

		worker1.start();
		worker2.start();
		worker3.start();

		//job1.run();

		System.out.println("�D�{������");
	}
}
