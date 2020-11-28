package NestedClass;

public class StaticOuter {

	static int data = 30;
	static class inner{
		void msg(){System.out.println("Data is:"+ data);}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StaticOuter o = new StaticOuter();
       StaticOuter.inner in = new StaticOuter.inner();
       in.msg();
       //if msg() static : StaticOuter.inner.msg();
		
	}

}
