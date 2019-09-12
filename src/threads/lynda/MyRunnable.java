package threads.lynda;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		int iteration = 5;
		try {
			for (int i =0 ;i < iteration; i++) {
				System.out.println("From RUNNABLE :"+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}

	}

}
