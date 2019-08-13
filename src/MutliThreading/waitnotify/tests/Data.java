package MutliThreading.waitnotify.tests;

public class Data {
	private String packet;
	private boolean transfer = true;
	
	public synchronized void sender(String data) {
		while(!transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		transfer = false;
		this.packet = data;
		System.out.println("Sending:"+packet);
		notifyAll();
	}
	
	public synchronized String reciever() {
		while(transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Recived:"+packet);
		transfer = true;
		notifyAll();
		return packet;
	}

}
