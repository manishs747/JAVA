package MutliThreading.oddeven.usingjoin;


public class PrintEvenOdd  implements Runnable{
	
	private int max;
    private Printer print;
    private boolean isEvenNumber;
	//int number = 1;
    
    PrintEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Printer print = new Printer();
	        Thread t1 = new Thread(new PrintEvenOdd(print, 10, false),"ODD ");
	        Thread t2 = new Thread(new PrintEvenOdd(print, 10, true),"EVEN");
	        t1.start();
	        t2.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int number = isEvenNumber == true ? 2 : 1;
		while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
                print.printEven(number);
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
                print.printOdd(number);
                // number+=2;
            }
            number += 2;
        }

		
	}

}
