package MutliThreading.waitnotify.tests;

public class Sender implements Runnable {
	
	private Data data;
	
	public Sender(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
	    String packets[] = {
	            "First packet",
	            "Second packet",
	            "Third packet",
	            "Fourth packet",
	            "FIFTH packet",
	            "SIXTH packet",
	            "SEVEN packet",
	            "End"
	          };
	    for (int i = 0; i < packets.length; i++) {
			data.sender(packets[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
