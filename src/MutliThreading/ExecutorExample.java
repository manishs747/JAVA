package MutliThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Counter{
	int count;
	public  void increment() {
		count++;
	}

}

public class ExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		ExecutorService executor = Executors.newFixedThreadPool(5);
		 // Runnable, return void, nothing, submit and run the task async
        executor.execute(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("A:"+c.count);
					c.increment();
				}
			}
		});
		

	}

}
