package MutliThreading;

public class TableThread1 extends Thread {
	
	@Override
	public void run() {
		Table.printTable(1);
	}

}
