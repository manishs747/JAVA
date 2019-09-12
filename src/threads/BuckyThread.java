package threads;

public class BuckyThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1= new Thread(new Tuna("ONE"));
		Thread t2= new Thread(new Tuna("TWO"));
		Thread t3= new Thread(new Tuna("THREE"));
		t1.start();
		t2.start();
		t3.start();
		

	}

}
