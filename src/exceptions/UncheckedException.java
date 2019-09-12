package exceptions;

public class UncheckedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		      try {
				int x = 0;
				  int y = 10;
				  int z = y/x;
				  System.out.println("check 1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		      
		      System.out.println("check 2");

	}

}
