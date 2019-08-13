package MutliThreading.syncronise;
public class GeekSyncDemo {

	public static void main(String args[]) { 
		Sender snd = new Sender(); 
		ThreadedSend S1 =   new ThreadedSend( " Hi " , snd ); 
		ThreadedSend S2 =  new ThreadedSend( " Bye " , snd ); 
		// Start two threads of ThreadedSend type 
		S1.start(); 
		S2.start(); 
		// wait for threads to end 
	/*	try{ 
			S1.join(); 
			S2.join(); 
		} 
		catch(Exception e) { 
			System.out.println("Interrupted"); 
		} */
	} 

}

class Sender {
	public void send(String msg) { 
		synchronized(this) 
        {
		System.out.println("Sending\t"  + msg ); 
		try{ 
			Thread.sleep(1000); 
		} 
		catch (Exception e) { 
			System.out.println("Thread  interrupted."); 
		} 
		System.out.println("\n" + msg + "Sent"); 
        }
	} 
}

//Class for send a message using Threads 
class ThreadedSend extends Thread { 
	private String msg; 
	private Thread t; 
	Sender  sender;
	ThreadedSend(String m,  Sender obj) {  // Recieves a message object and a string message to be sent 
		msg = m; 
		sender = obj; 
	} 

	public void run() { 
	//	synchronized(sender) { 	// Only one thread can send a message   at a time.
			sender.send(msg); // synchronizing the snd object 
	//	} 
	} 
}
