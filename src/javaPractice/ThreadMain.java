package javaPractice;

public class ThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MultiThreading m1= new MultiThreading();
      MultiThreading m2= new MultiThreading();
      m1.start();
      try {
		m1.join(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      m2.start();
      
      
	}

}
