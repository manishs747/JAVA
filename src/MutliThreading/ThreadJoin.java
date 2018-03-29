package MutliThreading;

public class ThreadJoin {
	   public static void main(String[] args) {
		   
		   
		   MyThreadJoin t = new MyThreadJoin();
	      //t.start();
		  // ThreadJoin tj = new ThreadJoin();
	        synchronized(t){
	            try {
	                System.out.println("Before wait:"+Thread.currentThread().getName());
	                //t.start();
	                t.wait(200);
	               // t.start();
	                System.out.println("After wait");
	            } catch (Exception e) {
	            	//InterruptedException
	                e.printStackTrace();
	            }
	        }
	        
	        
	                
	        for(int i = 0; i < 10; i++)
	            System.out.println("Thread " + Thread.currentThread().getName() + " will continue after join and print : " + i );
	    }
}
