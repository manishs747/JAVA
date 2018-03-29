package MutliThreading.code;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread started:::"+Thread.currentThread().getName());
		//System.out.println("thread is running. RunnableThread..");  
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
	}

}
