package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
	
	public static void main(String[] args) {
		
		ArrayList<Book> al=new ArrayList<Book>(); 
		al.add(new Book(101,"scince"));    
		al.add(new Book(102,"algo"));    
		al.add(new Book(103,"computer")); 
		Collections.sort(al);
		
		for(Book book:al){  
			System.out.println(book);  
			}  
	}

}
