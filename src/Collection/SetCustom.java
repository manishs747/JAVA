package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



/*
 * HashSet stores the elements by using a mechanism called hashing.
   HashSet contains unique elements only.
   
    the custom class should implement the Comparable interface or 
    a Comparator should be passed to TreeSet constructor during creation
 */

public class SetCustom {

	public static void main(String[] args) {
		//Creating HashSet and adding elements  
		List<String> list = new ArrayList<String>();
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		
		
		System.out.println("HASH SET");  
		displaySet(getHashSet(list));
		System.out.println("LINKED HASH SET");  
		displaySet(getLinkedHashSet(list));
		System.out.println("Tree HASH SET");  
		displaySet(getTreeHashSet(list));

		Set<Book> hset = getBooks();
		displayBook(hset);
		
	}

	/**
	 * @return 
	 * 
	 */
	private static Set<Book> getBooks() {
		Set<Book> set=new TreeSet<Book>();
		Book b1=new Book(101,"scince");    
		Book b2=new Book(102,"algo");    
		Book b3=new Book(103,"computer"); 
		set.add(b2);
		set.add(b3);
		set.add(b1);
		return set;
	}

	private static void displaySet(Set<String> hset) {
		Iterator<String> itr=hset.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}
	
	private static void displayBook(Set<Book> hset) {
		Iterator<Book> itr=hset.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}

	private static Set<String> getHashSet(List<String> list) {
		Set<String> set=new HashSet<String>();  
		set.addAll(list) ; 
		return  set;
	} 
	
	//Maintains insertion order.
	//The elements in TreeSet must be of Comparable type.
	//String and Wrapper classes are Comparable by default
	private static Set<String> getLinkedHashSet(List<String> list) {
		Set<String> set=new LinkedHashSet<String>();  
		set.addAll(list) ;  
		return  set;
	} 
	
	//Maintains ascending order
		private static Set<String> getTreeHashSet(List<String> list) {
			Set<String> set=new TreeSet<String>();  
			set.addAll(list) ;
			return  set;
		} 

}


