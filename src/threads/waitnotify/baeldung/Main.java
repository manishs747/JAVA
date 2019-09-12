package threads.waitnotify.baeldung;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Data data = new Data();
	    Thread sender = new Thread(new Sender(data));
	    Thread receiver = new Thread(new Receiver(data));
	     
	    sender.start();
	    receiver.start();
	}

}
