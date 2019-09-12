package threads;

public class MultiThreading extends Thread {

	
	@Override
	public void run() {
		
		synchronized (this) {
			String name = this.getName();
			try {
			if(name.equals("1")){
					Thread.sleep(50000);
			}else{
				Thread.sleep(1000);
			}
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            for (int i = 0; i < 10; i++) {
				System.out.println("IN Thread:"+this.getName()+":"+i);
			}	
		}
				
	}
	
	public static void main(String[] args) {
		 
		MultiThreading t = new MultiThreading();
			   // this will call run() function
			   t.start();

			   MultiThreading t2 = new MultiThreading();
			   // this will call run() function
			   t2.start();
	}
}
