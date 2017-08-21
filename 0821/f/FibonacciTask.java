import java.util.concurrent.RecursiveTask;

class FibonacciTask extends RecursiveTask<Integer>{
	private int num;
	private int result;

	public FibonacciTask(int num){
		this.num=num;
	}

	public int getResult(){
		return result;
	}

	protected Integer compute(){
		if(num<20){
			result=new Fibonacci().fibonacci(num);
		}else{
			FibonacciTask task1=new FibonacciTask(num-1);
			task1.fork();
			FibonacciTask task2=new FibonacciTask(num-2);
			result=task2.compute() + task1.join();
		}
		return result;
	}
}
