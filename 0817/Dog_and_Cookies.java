

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
        System.out.println("�D�H��F�� " + cNo + " ���氮.");
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
        System.out.println("�p�ժ��Y�F�� " + cNo + " ���氮.");
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
        Put put = new Put(cookies);      // �D�H��氮
        Eat eat = new Eat(cookies);      // �p�ժ��Y�氮
        Thread dog = new Thread(eat);    //�p�ժ������
        Thread master = new Thread(put); //�D�H�����
        dog.start();
        master.start();
    }
}
