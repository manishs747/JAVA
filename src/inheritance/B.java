package inheritance;

public class B extends A {
	
	   int b = 25;
	   static int c = 35;
	   int d = 6;
	   
	   public static void printStatic(){
	   	System.out.println("Static Pring B");
	   }


	   private void privateMethod(){
	   	System.out.println("B PRIVATE METHOD");
		}
	   
	   public void publicMethod(){
			System.out.println("B PUBLIC METHOD:b"+b);
		}
	   
	 /*  public void callPrivate(){
			 System.out.println("B call Priavted Called:a"+a);
			   this.privateMethod();
			   this.publicMethod();
		   }*/
	   
	   
	   public  void print(){
		   System.out.println(" Printing  B");
	   }

	public static void main(String[] args) {
		
		A aa = new B();
		aa.finalMethod();
		aa.callPrivate();
		aa.printStatic();  //static method cant be over ridden
		aa.print();    
		B bb =  new B();
		
	// 	data member doesnot inherited
		System.out.println(aa.a);
		System.out.println(aa.b);
		System.out.println(aa.c);
		//System.out.println(aa.d); it throughs error as A doesnt have d
		System.out.println(bb.b);
	     
		aa.callPrivate();///private method never get inherited
		

	}

}
