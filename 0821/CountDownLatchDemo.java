import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Student implements Runnable{

    private CountDownLatch downLatch;
    private String name;

    public Student(CountDownLatch downLatch, String name){
        this.downLatch = downLatch;
        this.name = name;
    }

    public void run() {
        this.doWork();
        try{
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        }catch(InterruptedException ie){
        }
        System.out.println(this.name + "功課做完了!");
        this.downLatch.countDown();

    }

    private void doWork(){
        System.out.println(this.name + "正在努力寫功課中....!");
    }

}

class Teacher implements Runnable {

    private CountDownLatch downLatch;

    public Teacher(CountDownLatch downLatch){
        this.downLatch = downLatch;
    }

    public void run() {
        System.out.println("老師正在等所有的學生把功課作完......");
        try {
            this.downLatch.await();
        } catch (InterruptedException e) {
        }
        System.out.println("老師收到所有的作業了");  
    }

}



class CountDownLatchDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        CountDownLatch latch = new CountDownLatch(3);

        Student w1 = new Student(latch,"張三");
        Student w2 = new Student(latch,"李四");
        Student w3 = new Student(latch,"王二");

        Teacher boss = new Teacher(latch);

        executor.execute(w3);
        executor.execute(w2);
        executor.execute(w1);
        executor.execute(boss);

        executor.shutdown();
    }

}
