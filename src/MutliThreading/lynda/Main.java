package MutliThreading.lynda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iteration = 5;

		
		//one of creating thread
		MyThread thread = new MyThread();
		thread.start();
		
		//2nd way of creating thread
		MyRunnable runnable = new MyRunnable();
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		
		
		try {
			for (int i = 0; i < iteration; i++) {
				System.out.println("from main thread :"+i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}

	}

}
