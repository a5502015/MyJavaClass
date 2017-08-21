import java.util.*;
import java.util.concurrent.*;

class Lotto implements Callable<Integer>{
	public Integer call() throws Exception{
		try{
			TimeUnit.SECONDS.sleep(new Random().nextInt(3));
		}catch(Exception e){}
		
		int num=(new Random().nextInt(49)+1);
		
		System.out.println("得到" + num + "時間:" + (new Date()));
		
		return num;
	}
}

class TestCallable{
	public static void main(String[] arg) throws Exception{
		System.out.println("請給一組樂透數字");
		
		ExecutorService pool=Executors.newCachedThreadPool();
		System.out.println("計算中..");
		Future<Integer> future=pool.submit(new Lotto());
		int result=future.get();
		
		System.out.println("樂透數字: " + result);
		
		pool.shutdown();
	
	}

}