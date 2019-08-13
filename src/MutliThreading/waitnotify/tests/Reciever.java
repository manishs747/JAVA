package MutliThreading.waitnotify.tests;

public class Reciever implements Runnable {

	private Data data;
	
	public Reciever(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		while(!"End".equals(data.reciever())) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
