

class FatherThread implements Runnable {
    public void run() {
        System.out.println("爸爸下班回家.");
		System.out.println("爸爸準備洗澡.");
		System.out.println("爸爸發現沒瓦斯了.");

		System.out.println("爸爸打電話請瓦斯工人送瓦斯.");
		Thread worker = new Thread(new WorkerThread());
		System.out.println("爸爸等待瓦斯工人 ...");
        worker.start();
        // insert code :

		//Thread.yield();



		try{
            //Thread.sleep(6000);
			      worker.join();
        }
        catch(InterruptedException e) {
            System.out.println("爸爸決定今天不洗熱水澡了 !");
        }


        System.out.println("爸爸開始洗澡 !");
		System.out.println("爸爸洗完澡了 !");
	}
}

class WorkerThread implements Runnable {
	public void run() {
		System.out.println();
        System.out.println("瓦斯工人送瓦斯中 ... ");
		try {
			for (int i=1; i<=(int)(Math.random()*6)+3; i++) {
				Thread.sleep(500);
				System.out.print(i+" 分鐘, ");
			}
		}
		catch (InterruptedException ie) {
			System.err.println("瓦斯工人送瓦斯途中發生意外 !");
		}
		System.out.println();
        System.out.println("瓦斯工人將瓦斯送到家了 !");
		System.out.println("瓦斯工人將瓦斯安裝完畢 !");
		System.out.println();

	}
}

public class Shower {
	public static void main(String[] args) {
		Thread father = new Thread(new FatherThread());
		father.start();
	}
}
/*
補充:
    volatile (易變的, 易揮發的) --> 保證 Thread 一定會去抓取最新的資料
	transient (短暫的, 一時的, 瞬間的) --> 不儲存在序列化物件中
	僅能宣告在 member variable 中
	strictfp - relate to flooting point operation
	transient - relate to persistence stuff
	volatile - relate to force always re-calculate (do not use buffering ... )
	native - relate to JNI

程式片段:
	A : static volatile boolean isWait = true;
    B : while(isWait) {}
    C : MotherThread.isWait = false;

*/
