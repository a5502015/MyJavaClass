import java.util.concurrent.Executor;

class Worker implements Runnable{
	public void run(){
		int i;
		for(i=1;i<=50;i++){
			System.out.println(Thread.currentThread().getName() + ",·h¤F" + i +"¿j¶ô");
		}
	}

}

class MyExecutor implements Executor{

	public void execute(Runnable r){
		new Thread(r).start();
	}
}


class ExecutorDemo{
	public static void main(String[] arg){
		MyExecutor exec=new MyExecutor();
		
		exec.execute(new Worker());
		exec.execute(new Worker());
		exec.execute(new Worker());
	}
}