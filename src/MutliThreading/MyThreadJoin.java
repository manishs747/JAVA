package MutliThreading;

public class MyThreadJoin extends Thread {
	
	  public synchronized void run(){
	       

	        System.out.println("Thread " + this.getName() + " will run for 1 minute");
	        try {
	            this.sleep(2000);
	            System.out.println(Thread.currentThread().getName() + " in MYThread JOin ");
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

}
