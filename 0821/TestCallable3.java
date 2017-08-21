import java.util.*;
import java.util.concurrent.*;

class TestCallable3{
	public static void main(String[] arg) throws Exception{
		System.out.println("請給七組樂透數字");

		ExecutorService pool=Executors.newCachedThreadPool();
		ArrayList<Callable<Integer>> list=new ArrayList<>();

		for(int i=1;i<=7;i++){
			list.add(new Lotto());
		}

		System.out.println("計算中..");
		int result=pool.invokeAny(list);


		System.out.println("樂透數字: " + result);
		/*
		for(Future future:resultList){
			System.out.print(future.get() + " ");
		}
		*/

		pool.shutdown();

	}

}
