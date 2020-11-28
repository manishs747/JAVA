package numbers;

public class DoubleClass {
	
	 public static double roundWithDecimals(double number, int scale) {
	        int pow = 10;
	        for (int i = 1; i < scale; i++)
	            pow *= 10;
	        double tmp = number * pow;
	        return (double) (int) ((tmp - (int) tmp) >= 0.5f ? tmp + 1 : tmp) / pow;

	    }
	
	public static void main(String[] args) {
		double a =5.34567234d;
		double roundOff = Math.round(a*100)/100.00d;
		System.out.println(roundOff);
	}

}
