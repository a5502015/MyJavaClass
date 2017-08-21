import java.util.concurrent.CyclicBarrier;
import java.util.Random;

class Student implements Runnable{

	CyclicBarrier cb;

	public Student(CyclicBarrier cb){
		this.cb=cb;
	}

	public void run(){
		Random rd=new Random();
		try{
			System.out.println(Thread.currentThread().getName() + "已簽到");
			System.out.println(Thread.currentThread().getName() + "走到教室上課");
			Thread.sleep(rd.nextInt(2000));
			System.out.println(Thread.currentThread().getName() + "已到教室");
			cb.await();
			System.out.println(Thread.currentThread().getName() + "聽課中");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

class Teacher implements Runnable{

	public void run(){
		Random rd=new Random();
		System.out.println("老師走到教室上課中");

		try{
			Thread.sleep(rd.nextInt(7500));
			System.out.println("老師已到教室,準備上課");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}


class CyclicBarrierDemo{
	public static void main(String[] arg){
		CyclicBarrier cb = new CyclicBarrier(3,new Teacher());

		Thread t1 = new Thread(new Student(cb), "張三");
        Thread t2 = new Thread(new Student(cb), "王二");
        Thread t3 = new Thread(new Student(cb), "李四");

        t1.start();
        t2.start();
        t3.start();
	}
}
