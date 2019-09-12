package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable {
	private String message;
	
	public WorkerThread(String s) {
		message=s;
	}

	
	 private void  processmessage(){
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "(Start message)" + message);
		processmessage();
		System.out.println(Thread.currentThread().getName() + "END");
	}
	
	
	public static void main(String[] args) {
		
		 ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
	        for (int i = 0; i < 10; i++) {  
	            Runnable worker = new WorkerThread("" + i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	}

}
