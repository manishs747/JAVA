package MutliThreading.waitnotify.tests;

public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
	    Thread sender = new Thread(new Sender(data));
	    Thread receiver = new Thread(new Reciever(data));
	     
	    sender.start();
	    receiver.start();

	}

}
