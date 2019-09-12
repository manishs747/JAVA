package bitwise;

public class NumberOfBitsDiffernet {

	public static int findNumberOfBits(int x, int y) {
		int bitCount = 0;
		int z = x ^ y;
		while (z != 0) {

			bitCount += z & 1;

			z = z >> 1;
		}

		return bitCount;

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int i = findNumberOfBits(4, 8);
   System.out.println("BIT DIFF:" + i);
	}

}
