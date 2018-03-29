package javaPractice;

public class A {
	
	
	public static void name(){ System.out.println("static method from A"); }
	
	public int data=3;
	public void addFive() { this.data += 5; System.out.print("a a a a "); }
	public void fun(){
		System.out.println("Class A: and Data:"+ this.data);
	}
	
	
	public int getData() {
		
		System.out.println("data:" + data);
		return data;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Class A";
	}

}
