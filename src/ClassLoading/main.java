package ClassLoading;

public class main {


		// TODO Auto-generated method stub
		  public static void main(String args[]) throws InterruptedException {
		    	
		    	
		    	
		       // Child t = new Child(); //initializing sub class, should trigger super class initialization
		   


		    	  
		        //accessing static field of Parent through child, should only initialize Parent
		      System.out.println(Child.familyName);//if we make variable final(compile time constatnt)class 
		      //initialzation will not happen.
		     }
	}


