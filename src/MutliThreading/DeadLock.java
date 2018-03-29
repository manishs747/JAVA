package MutliThreading;

public class DeadLock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String r1="manish";
		final String r2="rajnish";
		Thread t1= new Thread(){
	    public void run(){
        synchronized(r1){
			
				System.out.println("Thread 1 :locked resource r1");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(r2){
					System.out.println("Thread 1 :locked resource r2");
				}
				
}
			}
		};
		
		
		
		Thread t2= new Thread(){
		    public void run(){
	        synchronized(r2){
				
					System.out.println("Thread 2 :locked resource r2");
					try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized(r1){
						System.out.println("Thread 2 :locked resource r1");
					}				
	}
				}
			};
			
			t1.start();
			t2.start();
	}
}

