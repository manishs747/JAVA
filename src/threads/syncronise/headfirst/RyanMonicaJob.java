package threads.syncronise.headfirst;

public class RyanMonicaJob implements Runnable {
	private BankAccount bankAccount = new BankAccount();
	
	public static void main(String[] args) {
		
		RyanMonicaJob target = new RyanMonicaJob();
		Thread one = new Thread(target);
		Thread two = new Thread(target);
		one.setName("Ryan");
		two.setName("Monica");
				
		one.start();
		two.start();
		
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			makeWithDraw(10);
			if(bankAccount.getBalance() < 0) {
				System.out.println("OVERDRAWN");
			}
		}
	}
	
	
	private void makeWithDraw(int amount) {
		synchronized(bankAccount) {
		if (bankAccount.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName()+" is About to withdraw");
			try {
				System.out.println(Thread.currentThread().getName()+" is About to withdraw");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Woke UP");
			bankAccount.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" Completed Withdrawl UP");
			
			
		}else {
			System.out.println("Sorry Not Enough for "+ Thread.currentThread().getName());
		}
		}
		
	}

}
