package threads.lynda;

public class MyThread extends Thread {

	@Override
	public void run() {
		int iteration = 5;
		try {
			for (int i =0 ;i < iteration; i++) {
				System.out.println("From MyThread :"+i);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
	}

}
