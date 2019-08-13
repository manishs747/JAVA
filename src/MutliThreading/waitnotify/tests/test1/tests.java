package MutliThreading.waitnotify.tests.test1;


public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new  Printer();
		TaskOddEventest even = new TaskOddEventest( p, true,10);//Printer printer,boolean isEven,int max
		TaskOddEventest odd = new TaskOddEventest( p, false,10);
		new Thread(even).start();
		new Thread(odd).start();
	}

}
