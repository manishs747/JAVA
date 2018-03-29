package MutliThreading;

import java.util.Random;

public class Tuna implements Runnable {
	String name;
	int time;
	Random r = new Random();
	
	public Tuna(String x) {
		name=x;
		time=r.nextInt(999);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void run() {
		try {
   System.out.printf("%s us sleeping for %d \n",name,time);
   
	Thread.sleep(time);
	 System.out.printf("%s is done \n",name);
	
   } catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
