package bitwise;

public class Basic {

	public static void main(String[] args) {
		  int a = 60;	/* 60 = 0011 1100 */
	      int b = 13;	/* 13 = 0000 1101 */
	      int c = 0;
	      
	      int d = 1;
	      int  e = d << 1;
	      int f = d >> 1;
	      System.out.println(e );
	      System.out.println(f);
	      
	      
	      System.out.println("a = "+a+" b = "+b);
	      c = a & b;        /* 12 = 0000 1100 */
	      System.out.println("a & b = " + c );

	      c = a | b;        /* 61 = 0011 1101 */
	      System.out.println("a | b = " + c );

	      c = a ^ b;        /* 49 = 0011 0001 */
	      System.out.println("a ^ b = " + c );

	      c = ~a;           /*-61 = 1100 0011 */
	      System.out.println("~a = " + c );

	      c = a << 2;       /* 240 = 1111 0000 */
	      System.out.println("a << 2 = " + c );

	      c = a >> 2;       /* 15 = 1111 */
	      System.out.println("a >> 2  = " + c );   //Left Shift Divides by two  and Right Shift multiply by two.

	      c = a >>> 2;      /* 15 = 0000 1111 */  //unsigned
	      System.out.println("a >>> 2 = " + c );

	}
	
	/*
	 *  101  = (1*2^2) +0*2^1+ 1*2^0
	 * 
	 * 
	 * 
	 */
	
	 public static int convertBinaryToDecimal(long num)
	    {
	        int decimalNumber = 0, i = 0;
	        long remainder;
	        while (num != 0)
	        {
	            remainder = num % 10;
	            num /= 10;
	            decimalNumber += remainder * Math.pow(2, i);
	            ++i;
	        }
	        return decimalNumber;
	    }
	 
	    /*
		 * 583 = 5*10^2+8*10^1+3*10^0
		 * 
		 * 
		 * 
		 */
	  public static long convertDecimalToBinary(int n)
	    {
	        long binaryNumber = 0;
	        int remainder, i = 1, step = 1;

	        while (n!=0)
	        {
	            remainder = n % 2;
	            System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n/2);
	            n /= 2;
	            binaryNumber += remainder * i;
	            i *= 10;
	        }
	        return binaryNumber;
	    }

}
