package exceptions;

public class TryCatchWithReturn {

	
	@SuppressWarnings("finally")
	public static int getANumber(){
	    try{
			System.out.println("Try code Statrted");
			int n = 5/2;
			System.out.println("Code After Exception It Wont be Printed");
			return 7;
	    }catch (Exception e){
			System.out.println(e.getMessage());
		}
	    finally {

	    	System.out.println("finally code Statrted");
	        return 43;
	    }
	}
	
	public static void main(String[] args) {
		System.out.println(getANumber());
		
	}

}
