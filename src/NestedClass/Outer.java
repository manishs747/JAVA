package NestedClass;

public class Outer {

	private int data = 30;
	private static int sdata=440; 
	class Inner{
		void msg(){System.out.println("Data is:"+ data);}
	}
	
	 static class InnerStatic{  
		   void msg(){System.out.println("data is "+sdata);}  
		  }  
	
	void display(){
		Inner in =new Inner();
		in.msg();
	}
	
	//Method Local inner classes
	 void outerMethod() {
	        System.out.println("inside outerMethod");
	        // Inner class is local to outerMethod()
	        class InnerLocal {
	            void innerMethod() {
	                System.out.println("inside Local innerMethod");
	            }
	        }
	        InnerLocal y = new InnerLocal();
	        y.innerMethod();
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.display();
		Outer.Inner in =o.new Inner();
		in.msg();
		
		o.outerMethod();
		
		//static check
		Outer.InnerStatic obj=new Outer.InnerStatic(); 
		obj.msg(); 
		
		
		
	}

}
