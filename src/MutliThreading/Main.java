package MutliThreading;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       Scanner input =new Scanner(System.in);
       FortuneCookies r = new FortuneCookies("","" ,5000);
       
       Thread c1=new Thread( r);
       
      // Thread  d = new Thread(c1);
       c1.setName("Manish");
       Thread c2= new Thread( r);
       c2.setName("RAJNISH");
       Thread c3= new Thread( r);
      
       c3.setName("Preeti");
       c1.start();
       System.out.println(c1.isInterrupted());
       c1.interrupt();
       //Thread.sleep(500);
       System.out.println(c1.isInterrupted());
    //   c2.start();
     //  c3.start();
       
       c1.join();
       Thread t = new Thread();
       
     
     /* Fortune myfortune=  new  Fortune();
      myfortune.setDaemon(true);
      myfortune.start();*/
       System.out.println("Enter AnyThng");
       
      String val = input.next();
      System.out.println("U entered:"+val );
      
     
		
		//MultiThreading m = new MultiThreading();
	/*	
		MyRunnable  mr = new MyRunnable();
		Thread t=new Thread(mr);
		Thread t1=new Thread(mr);
		t.start();
        t1.start();*/
		try {
			for (int i = 0; i < 10; i++) {

				Thread.sleep(2000);
				System.out.println("Main Thread:"+i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("slept for few sec");
	}

}
