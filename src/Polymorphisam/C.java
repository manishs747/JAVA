package Polymorphisam;

public class C extends B {

	int data  = 11;
	void m3(){
		System.out.println("In C data :" + data);
		System.out.println("C M3 method"  + data + 6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new C();
		a.m1();
		System.out.println(a.data);

	}

}
