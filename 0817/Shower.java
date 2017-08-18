

class FatherThread implements Runnable {
    public void run() {
        System.out.println("�����U�Z�^�a.");
		System.out.println("�����ǳƬ~��.");
		System.out.println("�����o�{�S�˴��F.");

		System.out.println("�������q�ܽХ˴��u�H�e�˴�.");
		Thread worker = new Thread(new WorkerThread());
		System.out.println("�������ݥ˴��u�H ...");
        worker.start();
        // insert code :

		//Thread.yield();



		try{
            //Thread.sleep(6000);
			      worker.join();
        }
        catch(InterruptedException e) {
            System.out.println("�����M�w���Ѥ��~�������F !");
        }


        System.out.println("�����}�l�~�� !");
		System.out.println("�����~�����F !");
	}
}

class WorkerThread implements Runnable {
	public void run() {
		System.out.println();
        System.out.println("�˴��u�H�e�˴��� ... ");
		try {
			for (int i=1; i<=(int)(Math.random()*6)+3; i++) {
				Thread.sleep(500);
				System.out.print(i+" ����, ");
			}
		}
		catch (InterruptedException ie) {
			System.err.println("�˴��u�H�e�˴��~���o�ͷN�~ !");
		}
		System.out.println();
        System.out.println("�˴��u�H�N�˴��e��a�F !");
		System.out.println("�˴��u�H�N�˴��w�˧��� !");
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
�ɥR:
    volatile (���ܪ�, �����o��) --> �O�� Thread �@�w�|�h����̷s�����
	transient (�u�Ȫ�, �@�ɪ�, ������) --> ���x�s�b�ǦC�ƪ���
	�ȯ�ŧi�b member variable ��
	strictfp - relate to flooting point operation
	transient - relate to persistence stuff
	volatile - relate to force always re-calculate (do not use buffering ... )
	native - relate to JNI

�{�����q:
	A : static volatile boolean isWait = true;
    B : while(isWait) {}
    C : MotherThread.isWait = false;

*/
