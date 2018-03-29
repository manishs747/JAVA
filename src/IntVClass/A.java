package IntVClass;

public class A {
	public int i;

	public A() {
		System.out.println("Constructor");
		A a = new A();
		i=10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting");
		A a1 = new A();
		System.out.println("Done");

	}

}
