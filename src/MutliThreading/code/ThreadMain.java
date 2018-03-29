package MutliThreading.code;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread t1=new MyThread();  
		//t1.start(); 
	
		Runnable runnable = new MyRunnable();
		Thread t2 =new Thread(runnable); 
		Thread t3 =new Thread(runnable); 
		
		t2.start();
		t2.start();
		
	
		

	}

}
