package threads;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {
	
	
	private final BlockingQueue<Integer> sharedQueue;

    public Producer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }


	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Produced "+ i);
			try {
				sharedQueue.put(i);
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				   Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, e);
			}
		}
		
	}

}
