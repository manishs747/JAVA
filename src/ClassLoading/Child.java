package ClassLoading;

import mutliThreading.Main;

class Child extends Parent {
	
	
	//protected static String familyName = "childFamily";
	
    static { System.out.println("static block of Sub class is initialized in Java "); }
    {System.out.println("non static blocks in sub class is initialized");}
    
    
    
    
    
    
    
    public static void main(String args[]) throws InterruptedException {
    	
    	
    	
       // Child t = new Child(); //initializing sub class, should trigger super class initialization
   


    	  
        //accessing static field of Parent through child, should only initialize Parent
      // System.out.println(Parent.familyName);
     }


}

