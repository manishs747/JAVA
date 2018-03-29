package javaPractice.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class SetDEmo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count[]= {34, 22,10,60,30,22};
        System.out.println("HashSet:" + getHashSet(count) );
        System.out.println("TreeSet:" + getTreeSet(count) );
        System.out.println("LinkedHashSet:" + getLinkedHashSet(count) );
        System.out.println("SortedSet:" + getSortedSet(count) );
        System.out.println("Comperator:" +    getComperator(count) );
     
        Object o = new Object();
      /*  List<Integer> c=Collections.synchronizedList( new ArrayList<Integer>());
        c.add(9);
        c.add(7);
        System.out.println("Col:" +c);
        Collections.sort( c);
        System.out.println("Col:" +c);*/
 
        Vector v = new Vector<Integer>();
        v.add(5);
        
        ArrayList l = new ArrayList<Integer>();
        l.add(5);
	}
	
	public static Set<Integer> getHashSet(int []Count){
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < Count.length; i++) {
			set.add(Count[i]);
		}
		
		
		   return set;
	}
	
	public static Set<Integer> getTreeSet(int []Count){
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < Count.length; i++) {
			set.add(Count[i]);
		}
		   return set;
	}
	
	
	public static Set<Integer> getLinkedHashSet(int []Count){
		   Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < Count.length; i++) {
			set.add(Count[i]);
		}
		   return set;
	}

	
	public static Set<Integer> getSortedSet(int []Count){
		  SortedSet<Integer> set =  new TreeSet<Integer>();
		for (int i = 0; i < Count.length; i++) {
			set.add(Count[i]);
		}
		
		//set.add(null);
		   return set;
	}
	
	
	@SuppressWarnings("unchecked")
	public static List<Integer> getComperator(int []Count){
		  List<Integer> list =  new ArrayList<Integer>();
		for (int i = 0; i < Count.length; i++) {
			list.add(Count[i]);
		}
		
		Comparator com = Collections.reverseOrder();
		Collections.sort(list,com);
		return list;
	}
}
