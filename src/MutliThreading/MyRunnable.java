package MutliThreading;


public class MyRunnable implements Runnable {
	
	

    private volatile String  name;
	 public final String getName() {
	        return new String(name);
	    }

	
	 public MyRunnable(String name) {
			// TODO Auto-generated constructor stub
		 this.name =  name;
		}
	
	public MyRunnable() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("odd");
		MyRunnable r2 = new MyRunnable("even");
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		Thread t2 = new Thread(r1);
		t2.start();
		
	
	}

	@Override
	synchronized public  void run() {
		// TODO Auto-generated method stub

		if(getName().equals("odd")){
			forloop(1000);
		}else{
			forloop(2000);
		}
		
			//System.out.println(i);
		
	}

	public void forloop(int wait) {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.yield();
				//synchronized(Thread.currentThread()){
				//System.out.println("Entered Thread" + Thread.currentThread().getId());
				System.out.println("From Runnable Secondary Thread:"+i +" : " +Thread.currentThread().getName()+" ," + getName());
				
				Thread.sleep(wait);
				//System.out.println("Exist Thread" + Thread.currentThread().getId());
				//}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
