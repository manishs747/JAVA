package bitwise;

/*
 * 
Unary Operator,
Arithmetic Operator,
Shift Operator,
Relational Operator,
Bitwise Operator,
Logical Operator,
Ternary Operator and
Assignment Operator.
 * 
 *  
 
bitwise AND 	        &
bitwise exclusive OR 	^
bitwise inclusive OR 	|
shift	                << >> >>>
 
 if a = 60 and b = 13; now in binary format they will be as follows −

a = 0011 1100

b = 0000 1101

-----------------

a&b = 0000 1100

a|b = 0011 1101

a^b = 0011 0001

~a  = 1100 0011
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Theory {
	
	public static void main(String[] args) {
		int a = 12 ;
		int b = 25;
		bitwiseOR(12, 25);
		bitwiseAND(12, 25);
		bitwiseComplement(4);
	}
	
	
	/*
12 = 00001100 (In Binary)
25 = 00011001 (In Binary)

Bitwise OR Operation of 12 and 25
  00001100
| 00011001
  ________
  00011101  = 29 (In decimal)
	 */
	
     public static void bitwiseOR(int a ,int b) {
    	 int result = a | b;
    	 System.out.println("OR OPERATION OF "+a+" AND "+b+" is "+result);
     }
     
     public static void bitwiseAND(int a ,int b) {
    	 int result = a & b;
    	 System.out.println("AND OPERATION OF "+a+" AND "+b+" is "+result);
     }
     
     public static void bitwiseComplement(int a ) {
    	 int result = ~a;
    	 System.out.println("COMPLEMENT OPERATION OF "+a+" is "+result);
     }
     
     /*
      * The ^ operator compares corresponding bits of two operands. If corresponding bits are different, it gives 1. If corresponding bits are same, it gives 0.
      * Bitwise XOR Operation of 12 and 25
	  00001100
	| 00011001
	  ________
	  00010101  = 21 (In decimal)
      */
     
     public static void bitwiseXOR(int a ,int b) {
    	 int result = a ^ b;
    	 System.out.println("AND OPERATION OF "+a+" AND "+b+" is "+result);
     }
     

}
