package MutliThreading.lynda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iteration = 5;

		MyThread thread = new MyThread();
		thread.start();
		try {
			for (int i = 0; i < iteration; i++) {
				System.out.println("from main thread :"+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}

	}

}
