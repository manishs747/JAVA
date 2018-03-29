package MutliThreading;

public class ThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*MultiThreading m1= new MultiThreading();
      MultiThreading m2= new MultiThreading();
      m1.run();
      m2.run();*/
		
	/*	
      MyRunnable  runnable = new  MyRunnable();
      Thread t= new Thread(runnable);
      t.start();
      
      for (int i = 0; i < 3; i++) {
		System.out.println("From main thread");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
		
		TargetClass target = new TargetClass();
		MyThreadSyn t1= new MyThreadSyn(1, target);
		MyThreadSyn t2= new MyThreadSyn(2, target);
		MyThreadSyn t3= new MyThreadSyn(3, target);
		
		
		t1.start();
		t2.start();
		t3.start();
      
	}

}
