package MutliThreading;

public class MyThreadSyn extends Thread {
 private int threadId;
 private TargetClass target;
 
 
 public MyThreadSyn(int threadId,TargetClass target	) {
	 this.threadId =threadId;
	 this.target=target;
 }
 
 
 @Override
	public void run() {
	 synchronized (target) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			target.call(threadId);
			
	}

	}

 
 public static void main(String[] args) {
	TargetClass target = new TargetClass();
	MyThreadSyn t1 = new MyThreadSyn(1, target);
	MyThreadSyn t2 = new MyThreadSyn(2, target);
	MyThreadSyn t3 = new MyThreadSyn(3, target);
	
	t1.start();
	t2.start();
	t3.start();
}
	
}
