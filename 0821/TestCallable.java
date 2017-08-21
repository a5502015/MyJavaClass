import java.util.*;
import java.util.concurrent.*;

class Lotto implements Callable<Integer>{
	public Integer call() throws Exception{
		try{
			TimeUnit.SECONDS.sleep(new Random().nextInt(3));
		}catch(Exception e){}
		
		int num=(new Random().nextInt(49)+1);
		
		System.out.println("�o��" + num + "�ɶ�:" + (new Date()));
		
		return num;
	}
}

class TestCallable{
	public static void main(String[] arg) throws Exception{
		System.out.println("�е��@�ռֳz�Ʀr");
		
		ExecutorService pool=Executors.newCachedThreadPool();
		System.out.println("�p�⤤..");
		Future<Integer> future=pool.submit(new Lotto());
		int result=future.get();
		
		System.out.println("�ֳz�Ʀr: " + result);
		
		pool.shutdown();
	
	}

}