package javaPractice.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  list = new ArrayList<Integer>();
           list=add(list);
           System.out.println("Original:"+ list);
          // copy(list);
           //reverse(list);
           sort(list);
           
           
           ArrayList<String>  slist = new ArrayList<String>(); 
           slist.add("manish");
           slist.add("aditi");
           slist.add("preeti");
           sortString(slist);
	}
	
	
public static ArrayList<Integer> add(ArrayList<Integer> list){
	   for (int i = 1; i < 6; i++) {
			list.add(i*2-1);
		}
		return list;
	}
	public static void copy(ArrayList<Integer> list){
		ArrayList<Integer>  clist = new ArrayList<Integer>(10);
		clist.add(0);
		clist.add(0);
		clist.add(0);
		clist.add(0);
		clist.add(0);
		
		Collections.copy(clist, list);
		 
		// clist.addAll(list);
		 System.out.println("Copied:"+clist);
	}
	
	public static void reverse(ArrayList<Integer> list){
	     Collections.reverse(list);
		 System.out.println("Reversed:"+list);
	}
	
	public static void sort(ArrayList<Integer> list){
		
	     
		 Collections.sort(list,new MyComparator() );
		 System.out.println("Sort:"+list);
	}
	
	public static void sortString(ArrayList<String> list){
		System.out.println("Orginal:"+list);
	     
		 Collections.sort(list,new MyStringComparator() );
		 System.out.println("Sort:"+list);
	}

}
