package threads.waitnotify.tests.test1;

public class Printer {
	boolean isEven = false;
	public synchronized void even(int i) {
		if(!isEven) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(i);
		isEven = false;
		notifyAll();
	}
	
	
	public synchronized void odd(int i) {
		if(isEven) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(i);
		isEven = true;
		notifyAll();
	}

}
