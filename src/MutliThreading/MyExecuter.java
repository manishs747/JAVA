package MutliThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecuter {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		MyRunnable mr = new MyRunnable();

		ExecutorService executer = Executors.newFixedThreadPool(2);
		
		 executer.submit(mr); executer.submit(mr); executer.submit(mr);
		 executer.submit(mr); executer.submit(mr); executer.submit(mr);
		 
		executer.execute(mr);
		// executer.execute(mr);
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);

		t1.setName("FIRST");
		t2.setName("SECOND");
		t3.setName("THIRD");

		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		// t1.join();
		t2.start();
		// t2.join();
		// t3.start();

		
		t2.setPriority(Thread.MIN_PRIORITY);
		// t1.join();

		String s = new String();

		try {
			for (int i = 0; i < 10; i++) {

				Thread.sleep(2000);
				System.out.println("Main Thread:" + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("slept for few sec");
	}

}


