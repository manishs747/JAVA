package threads.waitnotify.baeldung;


/*
 * 
 * https://www.baeldung.com/java-wait-notify
 * 
 */

public class Data {
	private String packet;
    private boolean transfer = true;   // True if receiver should wait   False if sender should wait
    public synchronized void send(String packet) {
        while (!transfer) {
            try { 
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                System.out.println("Thread interrupted"); 
            }
        }
        transfer = false;
        this.packet = packet;
        notifyAll();
    }
    
    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
                System.out.println("Thread interrupted");
            }
        }
        transfer = true;
        notifyAll();
        return packet;
    }

}
