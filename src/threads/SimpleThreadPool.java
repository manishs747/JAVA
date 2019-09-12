package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ExecutorService executer =Executors.newFixedThreadPool(5);
         
         
         for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread(""+i);
			executer.execute(worker);
		}
         executer.shutdown();
       //  while (!executer.isTerminated()) {}
         
         System.out.println("Finished al thread");
	}

}
