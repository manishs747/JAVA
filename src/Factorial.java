
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       int num = 5;
       System.out.println("factorial  of " + num + " is " + factorial(num));
       System.out.println("fibonaci of" + num + "  is " + fibonaci(num));
       
	}
	
	
	
	
	public static int factorial(int n){
		if(n==1){
			return n;
		}
		
		return n*factorial(n-1);
		
	}
	
	public static int fibonaci(int n){
		if(n==0||n==1){
			return n;
		}
	 return fibonaci(n - 1)	+ fibonaci(n-2);
	}
	
	

}
