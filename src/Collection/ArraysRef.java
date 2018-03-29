package Collection;

import java.util.Arrays;

public class ArraysRef {

	public ArraysRef() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
	
		int a[]={5,3,7,4};//declaration, instantiation and initialization  
		  
		printArrays(a);
		Arrays.sort(a);
		printArrays(a);
		
	}

	public static void printArrays(int[] a) {
		//printing array  
		for(int i=0;i<a.length;i++){//length is the property of array  
		System.out.print(a[i] + " ");  
		
		}
		System.out.println(" ");
	}

}
