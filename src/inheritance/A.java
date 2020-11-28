package inheritance;

public class A {
	
	private int a = 10;
	private int b = 20 ;
	static int c = 30;	
	
	
	private void privateMethod(){
		System.out.println("A PRIVATE METHOD:A"+b);
	}

	final void finalMethod(){
		System.out.println("A FINAL METHOD:A"+b);
	}
	
	public void publicMethod(){
			System.out.println("A PUBLIC METHOD");
		}
	
	 public void callPrivate(){
		 System.out.println("A called Private Called:a:"+a);
		   privateMethod();
		   publicMethod();
	   }
	 
	
	
	 public static void printStatic(){
		   System.out.println("Static Pring A");
	   }
	 
	 public   void print(){
		   System.out.println(" Print A method value of data member b:  "+b);
	   }

}
