package MutliThreading;

public class Customer implements Runnable {
	int amount =1000;
	
	synchronized void withdraw(int amount){
		System.out.println("Going to withdraw");
		if(this.amount<amount){
			System.out.println("Less balance please deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.amount -=amount;
		System.out.println("Widthraw Completee");
	}
		
	
	synchronized void deposit(int amount) {
			System.out.println("Going to Deposit");
			this.amount +=amount;
			System.out.println("deposit Completed");
		    notify();
			
		}
		
	
	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
