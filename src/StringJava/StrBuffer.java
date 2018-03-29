package StringJava;

import ClassLoading.main;

/*Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously.
So it is safe and will result in an order.*/
public class StrBuffer {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("manish");
		str.append(" kumar");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		System.out.println(str);
	}
}
