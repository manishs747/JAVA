package javaPractice.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

	public static void stringSort(){
		ArrayList<String> list =new ArrayList<String>();
		list.add("cba");
		list.add("abc");
		list.add("bca");
		
		
		Collections.sort(list);
		System.out.println(list);
	}
	
	
	public static void reatainAll(){
		ArrayList<Integer> l1 =new ArrayList<Integer>();
		ArrayList<Integer> l2 =new ArrayList<Integer>();
		
		l1.add(1);
		l1.add(3);
		l1.add(5);
		
		l2.add(1);
		l2.add(3);
		l2.add(6);
		
	     //l1.retainAll(l2);//retain all which have same key
	    // l1.removeAll(l2);//removes that have same keys
		l1.containsAll(l2);
	   System.out.println(l1);
	   System.out.println(l1.get(0));
	    
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int[] intArray = new int[]{7,3,2,6,45,2,3,9,7};
            Arrays.sort(intArray);
            for (int i : intArray) {
				System.out.print(i + ",");
			}*/
		
		reatainAll();
	}

}
