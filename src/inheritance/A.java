package inheritance;

public class A {
	
	int a = 10;
	int b = 20 ;
	static int c = 30;	
	
	
	private void privateMethod(){
		System.out.println("A PRIVATE METHOD:b"+b);
	}
	
	  public void publicMethod(){
			System.out.println("A PUBLIC METHOD");
		}
	
	 public void callPrivate(){
		 System.out.println("A call Priavted Called:a"+a);
		   privateMethod();
		   publicMethod();
	   }
	 
	
	
	 public static void printStatic(){
		   System.out.println("Static Pring A");
	   }
	 
	 public  void print(){
		   System.out.println(" Pring A");
	   }

}