package threads.syncronise;


class Counter{
	int count;
	public synchronized void increment() {
		count++;
	}

}

public class TelescoSyncDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("A");
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("B");
					c.increment();
				}
			}
		});

		t1.start();  
		t2.start();
		t1.join();  //other thread wait for t1 to complete
		System.out.println("Count:"+c.count);
		t2.join();
		System.out.println("Count:"+c.count);
	}

}
