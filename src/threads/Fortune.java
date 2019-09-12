package threads;

public class Fortune extends Thread {
@Override
public void run() {
	while(true){
		   System.out.println("Keep work hard Fortune will change");
		   try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}
