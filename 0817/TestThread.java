class Job1 implements Runnable{
	public void run(){
		int i;
		for(i=1;i<=25;i++){
			System.out.println(Thread.currentThread().getName() + "搬了第" + i + "包水泥");
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

class TestThread{
	public static void main(String[] arg){
		System.out.println(Thread.currentThread().getName());
		
		
		Job1 job1=new Job1();
		Job2 job2=new Job2();
		
		Thread worker1=new Thread(job1);
		worker1.setName("丁一");
		
		Thread worker2=new Thread(job1,"王二");
		Thread worker3=new Thread(job1,"張三");
		
		worker1.setPriority(3);
		worker2.setPriority(10);
		worker3.setPriority(1);
		
		worker1.start();
		worker2.start();
		worker3.start();
		
		//job1.run();
				
		System.out.println("主程式結束");
	}
}