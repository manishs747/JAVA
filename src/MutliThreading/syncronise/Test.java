package MutliThreading.syncronise;

//synchronized block, allowing only one thread to execute at any given time.

public class Test {
	
	public static void main(String[] args) {
		
		TargetClass targetClass = new TargetClass();
		MyThread t1 = new MyThread(1, targetClass);
		MyThread t2 = new MyThread(2, targetClass);
		MyThread t3 = new MyThread(3, targetClass);
		t1.start();
		t2.start();
		t3.start();
	}

}
