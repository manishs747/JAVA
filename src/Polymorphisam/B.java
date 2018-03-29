package Polymorphisam;

public class B  extends A{
   
	int data = 9;
	void m1(){
		//System.out.println("In B data :" + data);
		System.out.println("B M1 method data:" + data );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		B b = new B();
		
		System.out.println(a.data);
		System.out.println(b.data);
	//	a.m1();
	//	b.m1();
	//	a.m2();
		
		
		

	}

}
