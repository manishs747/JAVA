package threads.waitnotify.tests.test1;


public class TaskOddEventest implements Runnable{
	private boolean isEven;
	private Printer printer;
	private int max;
	public TaskOddEventest(Printer printer,boolean isEven,int max) {
		this.printer = printer;
		this.isEven = isEven;
		this.max = max;
	}
	public void run() {
		int n = isEven ? 2:1;
		for (int i = n; i <= max; i = i + 2) {
			if(isEven) {
				printer.even(i);
			}else {
				printer.odd(i);
			}
		}
	}

}
