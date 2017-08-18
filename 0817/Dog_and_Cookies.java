

class Cookies {
    private int cookiesNo;
    private static volatile boolean empty = true;
    public synchronized void put(int cNo) {
        while(!empty) {
            try {
                wait();
            }
            catch(InterruptedException e){}
        }
        System.out.println("主人放了第 " + cNo + " 塊餅乾.");
		cookiesNo = cNo;
        empty = false;
        notify();
    }
    public synchronized void eat(int cNo) {
        while(empty) {
            try {
                wait();
            }
            catch(InterruptedException e){}
        }
        System.out.println("小白狗吃了第 " + cNo + " 塊餅乾.");
        empty = true;
		notify();
    }
}
class Eat implements Runnable {
    Cookies cookies;
    Eat(Cookies cookies) {
        this.cookies = cookies;
    }
    public void run() {
        for(int i=1;i<=10;i++) {
            cookies.eat(i);
        }
    }
}
class Put implements Runnable {
    Cookies cookies;
    Put(Cookies cookies) {
        this.cookies = cookies;
    }
    public void run() {
        for(int i=1;i<=10;i++) {
			//synchronized(cookies){
            cookies.put(i);
			//}
        }
    }
}
public class Dog_and_Cookies {
    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        Put put = new Put(cookies);      // 主人放餅乾
        Eat eat = new Eat(cookies);      // 小白狗吃餅乾
        Thread dog = new Thread(eat);    //小白狗執行緒
        Thread master = new Thread(put); //主人執行緒
        dog.start();
        master.start();
    }
}
