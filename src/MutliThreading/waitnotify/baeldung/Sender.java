package MutliThreading.waitnotify.baeldung;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
	
	public Sender(Data data) {
		this.data = data;
	}

	private Data data;
	
    public void run() {
        String packets[] = {
          "First packet",
          "Second packet",
          "Third packet",
          "Fourth packet",
          "End"
        };
  
        for (String packet : packets) {
        	System.out.println("SENDING:"+packet);
            data.send(packet);
            //Thread.sleep() to mimic heavy server-side processing
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
               System.out.println("error");
            }
        }
    }

}
