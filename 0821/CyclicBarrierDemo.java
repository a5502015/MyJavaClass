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
			System.out.println(Thread.currentThread().getName() + "�wñ��");
			System.out.println(Thread.currentThread().getName() + "����ЫǤW��");
			Thread.sleep(rd.nextInt(2000));
			System.out.println(Thread.currentThread().getName() + "�w��Ы�");
			cb.await();
			System.out.println(Thread.currentThread().getName() + "ť�Ҥ�");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

class Teacher implements Runnable{

	public void run(){
		Random rd=new Random();
		System.out.println("�Ѯv����ЫǤW�Ҥ�");

		try{
			Thread.sleep(rd.nextInt(7500));
			System.out.println("�Ѯv�w��Ы�,�ǳƤW��");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}


class CyclicBarrierDemo{
	public static void main(String[] arg){
		CyclicBarrier cb = new CyclicBarrier(3,new Teacher());

		Thread t1 = new Thread(new Student(cb), "�i�T");
        Thread t2 = new Thread(new Student(cb), "���G");
        Thread t3 = new Thread(new Student(cb), "���|");

        t1.start();
        t2.start();
        t3.start();
	}
}
