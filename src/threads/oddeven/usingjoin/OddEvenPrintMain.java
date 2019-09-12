package threads.oddeven.usingjoin;

public class OddEvenPrintMain {
	
	boolean isOdd;
	int count = 1;
	int MAX = 10;
	
	public OddEvenPrintMain() {
		// TODO Auto-generated constructor stub
		this.isOdd = true;
		count = 1;
		MAX = 10;
	}
	
	public OddEvenPrintMain(int max ,int count ,boolean isOdd){
		MAX = max;
		this.count = count;
		this.isOdd = isOdd;
	}
	
	
	
	public static void main(String[] args) {
		OddEvenPrintMain oep = new OddEvenPrintMain();
		Thread t1 = new Thread(new Runnable() {
			 
			@Override
			public void run() {
				oep.printEven();
 
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			 
			@Override
			public void run() {
				oep.printOdd();
 
			}
		});
 
		t1.start();
		t2.start();
	}
	
	
	public void printOdd() {
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking odd loop");
				while (isOdd == false) {
					try {
						System.out.println("Odd waiting : " + count);
						wait();
						System.out.println("Odd Notified odd :" + count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread :" + count);
				count++;
				isOdd = false;
				notifyAll();

			}
		}
	}
		
	public void printEven() {
	
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking even loop");
 
				while (isOdd) {
					try {
						System.out.println("Even waiting: " + count);
						wait();
						System.out.println("Even Notified even:" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even thread :" + count);
				count++;
				isOdd = true;
				notifyAll();
 
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
