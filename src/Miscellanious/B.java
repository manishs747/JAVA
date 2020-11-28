package Miscellanious;


public class B extends A {
	
	public static void name(){ System.out.println("static method from B"); }

	public int data=10;
	public int datab=5;
	
	public void addFive() { this.data += 5; System.out.print("b b b b b "); }
	public int hello(){
		System.out.println("hello");

		return 1;
	}
	
	public int getData() {
		System.out.println("Calling super:Data:" + super.data);
		System.out.println("data B:" + data);
		return data;
	}
	public void fun(){
		System.out.println("Class B: and Data:"+ this.data);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		int i = super.data;
		return "Class B";
	}
	
	
	public static void main(String[] args) {
	/*	B b = new B();
		A a = new B();
		b=(B) a;
		a=new B();
	   System.out.println(b.hello());*/
		//Collections.sort(list);
		
		//testing datamember inheritence
		A a1 = new A();
		a1.addFive();
		System.out.println(a1.data);
		a1.getData();
		a1 = new B();
	
		System.out.println(a1.data);//print A data as datamember dont get inherited
		a1.getData();
		
	 
	   //a.hello(); not possible
	   
	   //testing static dynamic method over ride
		
		A a = new A();
		a.name();// should call static method from super class (A)
		// because type of reference variable
		
		 a = new B();
		 a.name(); // as per overriding rules this should call to child's(B) static
		 // overridden method. Since static method can not be overridden 
		 // , it will call parent static method   // because Type of p is Parent.

		 B b = new B();
		 b.name();//it call B child method as because static method get called by type of class
	   
	}
}
