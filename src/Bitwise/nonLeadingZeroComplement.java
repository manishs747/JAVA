package Bitwise;

public class nonLeadingZeroComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(nonLeadingZeroComplement(5));
		int a = 5 >> 2;
		int b =  5 >>> 2;
		System.out.println( Integer.toBinaryString(a));
	
		 System.out.println( Integer.toBinaryString(b));
		
	}
	
	 static int nonLeadingZeroComplement(int i) {
		 System.out.println("ACTUAL VALUE:"+i+" BIN:"+Integer.toBinaryString(i));
		int highestBit = Integer.highestOneBit(i);
		System.out.println("HighestBit :"+highestBit+"  BIN:"+Integer.toBinaryString(highestBit));
		int t = Integer.highestOneBit(i) << 1;
		System.out.println("T :"+t+"  BIN:"+Integer.toBinaryString(t));
	    int ones = (Integer.highestOneBit(i) << 1) - 1;
	    System.out.println("ONES :"+ones+"  BIN:"+Integer.toBinaryString(ones));
	    
	    return i ^ ones;
	}

}
