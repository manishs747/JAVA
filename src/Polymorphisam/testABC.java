package Polymorphisam;

public class testABC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//set 1
		
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 =  new C();
		
		//set 1
		/*b.m1();
		c.m2();
		a.m3();*/
		
		//set2
		/*c.m1();
		c.m2();
		c.m3();*/
		
		//set 3
		/*a.m1();
		b.m2();
		c.m3();*/
		
		
		a2.m1();
		a2.m2();
		a2.m3();
		System.out.println("A2 data:" + a2.data);

	}

}
