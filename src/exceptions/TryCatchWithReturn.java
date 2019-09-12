package exceptions;

public class TryCatchWithReturn {

	
	@SuppressWarnings("finally")
	public static int getANumber(){
	    try{
	        return 7;
	    } finally {
	    	System.out.println("finally code Statrted");
	        return 43;
	        //compile error  if write any thng
	        
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getANumber());
		
		//int [] name = new int[5];
		

		
	}

}
