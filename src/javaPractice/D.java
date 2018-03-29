package javaPractice;

public class D extends B {
	public int data=14;
	public void fun(){
		System.out.println("Class D: and Data:"+ this.data);
	}
	
	public static void main(String[] args) {
		C c = new C();
		
		c.print(new D());
	}

}
