package threads.syncronise;

/*
 * https://www.baeldung.com/java-synchronized
 */

public class MyThread extends Thread {

	private int threadId;
	private TargetClass targetClass;
	public MyThread(int threadId,TargetClass targetClass ) {
		this.threadId = threadId;
		this.targetClass = targetClass;
	}

	@Override
	public void run() {
		synchronized (targetClass) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			targetClass.call(threadId);
			
		}
	}

}
