package threads;

public class TableThread2 extends Thread {
	@Override
	public void run() {
		Table.printTable(5);
	}
	
	
	public static void main(String[] args) {
		
		TableThread1 t1 =  new TableThread1();
		TableThread2 t2 =  new TableThread2();
		
		t1.start();
		t2.start();
		
	}

}
