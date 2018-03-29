
public class NumberFormating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double i = 47456.23456;
		 String r1 = String.format("i have %,6.2f", i);
		 System.out.println(r1);
		 String r2 = String.format("i have %,6.1f", 4.12);
		 System.out.println(r2);
		 String r3 = String.format("i have %c", 42);
		 System.out.println(r3);
		 String r4 = String.format("i have %x", 42);
		 System.out.println(r4);
		 

	}

}
