package threads.waitnotify.oddeven;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread odd =new Thread( new TaskEvenOdd(10,printer,false),"ODD");
		Thread even = new Thread(new TaskEvenOdd(10,printer,true),"EVEN");
		odd.start();
		even.start();
	}

}
