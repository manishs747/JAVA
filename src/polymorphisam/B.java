package polymorphisam;

import java.util.ArrayList;
import java.util.List;

public class B  extends A{
	//int data = 9;
	int data2 = 10;
	int m1(){
		//System.out.println("In B data :" + data);
		//System.out.println("B M1 method data:" + data );
		return this.data;
	}
	
	
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		System.out.println(a.data+" : "+a.m1());
		System.out.println(b.data+" : "+b.m1());

		System.out.println(b.some(b));

	}


	public A some(A a){
		return a;
	}

}
