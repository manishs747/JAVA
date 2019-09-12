package threads.producerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
		  //Creating Producer and Consumer Thread
	     Thread prodThread = new Thread(new Producer(sharedQueue));
	     Thread consThread = new Thread(new Consumer(sharedQueue));

	     
	     //Starting producer and Consumer thread
	     prodThread.start();
	     consThread.start();


	}

}
