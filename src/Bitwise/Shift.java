package Bitwise;

public class Shift {

	
	
	public static void shiftNum(){
		
		int a=8,b=-8;
		System.out.println("a = " + a + " b = " + b);
		System.out.println("a >> 1 " + (a >> 1));
		System.out.println("a >> 2 " + (a >> 2));
		System.out.println("a >> 3 " + (a >> 3));
		System.out.println("a << 1 " + (a << 1));
		System.out.println("a >>>  1 " + (a >>> 1));
		System.out.println("b >> 1 " + (b >> 1));
		System.out.println("b >>>  1 " + (b >>> 1));
		
	}
	
	public static void anDOr(){
		int a= 5,b=9;
		System.out.println("a = "+ a+":"+Integer.toBinaryString(a) + " b = "+ b+" :"+Integer.toBinaryString(b));
		System.out.println(" a & b = " + ( a & b) );
		System.out.println(" a | b = " + ( a | b));
		System.out.println(" a ^ b = " + ( a ^ b));
		System.out.println(" a ^ a = " + ( a ^ a));
	}
	
	
	public static void main(String[] args) {
		//shiftNum();

	 anDOr();
	}

}
