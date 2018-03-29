package ExceptionHandling;

public class TestcustomException {
	
	
	static void validate( )throws customException{  
	 
	      throw new customException("not valid");  
	}
	
	public static void main(String[] args) {
	     try{  
	         validate();  
	         }catch(Exception m){System.out.println("Exception occured: "+m.getLocalizedMessage());}  
	     
	         System.out.println("rest of the code...");  
	     }  
	

}
