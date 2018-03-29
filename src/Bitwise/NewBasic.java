package Bitwise;

/*
 * 
   int is of 4 bytes,hence 32 bits
   
   http://www.java-samples.com/showtutorial.php?tutorialid=268
   
   
 * 
 * 
 * 
 */
public class NewBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		//for (int i = 1; i <= n; i++) {
			//System.out.println(i+ " : " + Integer.toBinaryString(i));
		//}
	    int l = n << 1;
		int r = n >> 1;
		System.out.println("ACTUAL:"+Integer.toBinaryString(n));
		System.out.println("Left SHift:"+Integer.toBinaryString(l));
		System.out.println("RIGHT SHift:"+Integer.toBinaryString(r));
		//System.out.println(Integer.toBinaryString(50)); 
		//System.out.println(Integer.toBinaryString(13));
		//System.out.println(Integer.parseInt("100", 2));  
		
	
		  int i = 5;
		  System.out.println("Binary Reprsentation of "+ i + " : " + Integer.toBinaryString(i));
		  int highestOneBit = Integer.highestOneBit(i);
		  System.out.println("Highest one bit : " + Integer.toBinaryString(highestOneBit));
		
		
		
	}
	
	private static int nonLeadingZeroComplement(int i) {
	    int ones = (Integer.highestOneBit(i) << 1) - 1;
	    return i ^ ones;
	}

}
