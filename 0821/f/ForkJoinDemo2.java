import java.util.Date;
import java.util.concurrent.ForkJoinPool;

class ForkJoinDemo2{
	public static void main(String[] arg){
		int num=32;

		//沒有使用平行運算
		long t1=new Date().getTime();
		System.out.print(new Fibonacci().fibonacci(num) + " ");
		long t2=new Date().getTime();
		System.out.println("花費時間:" +(t2-t1));

		long t3=new Date().getTime();
		int processors=Runtime.getRuntime().availableProcessors();
		FibonacciTask task=new FibonacciTask(num);
		ForkJoinPool pool=new ForkJoinPool(processors);
		pool.invoke(task);
		System.out.print(task.getResult() + " ");
		long t4=new Date().getTime();
		System.out.println("花費時間:" +(t4-t3));
		System.out.println("CPU數量:" + processors);
	}


}
