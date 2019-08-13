package MutliThreading.waitnotify.oddeven;

public class Printer {
	 private volatile boolean isOdd = false;
	
	 
	 synchronized void printEven(int number) {
		 while (!isOdd) {
			// System.out.println("PRINT EVEN:"+number);
			 try { 
				 wait();
			 } catch (InterruptedException e)  {
				 Thread.currentThread().interrupt(); 
				 System.out.println("Thread interrupted"); 
			 }
		 }
		 System.out.println(Thread.currentThread().getName() + ":" + number);
		 isOdd = false;
		 notifyAll();
	 }
	 
	 
	 
	 synchronized void printOdd(int number) {
	        while (isOdd) {
	        //	System.out.println("PRINT ODD:"+number);
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	        System.out.println(Thread.currentThread().getName() + ":" + number);
	        isOdd = true;
	        notify();
	    }

}
