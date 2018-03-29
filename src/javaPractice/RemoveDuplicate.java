package javaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name ="AAAAAAAAAABBBBBBBBCCC";
		//System.out.println("before:" + name);
		//name=removeDuplicateNSquare(name);
	
		
		
		
		name=removeDuplicateHashMap(name);
		System.out.println("Afetr:" + name);
	}

	private static void test() {
		String string = "malayalam";

	    char[] chars = string.toCharArray();
	    Set<Character> charSet = new HashSet<Character>();
	    for (char c : chars) {
	        charSet.add(c);
	    }
       System.out.println("charSet->" + charSet);
	    StringBuilder sb = new StringBuilder();
	    for (Character character : charSet) {
	        sb.append(character);
	    }
	    System.out.println(sb.toString());
	}

	  public static String removeDuplicateNSquare(String name){
		 // Set<Character> charSet = new LinkedHashSet<Character>();
		  StringBuilder sb = new StringBuilder();
		  char[]  chrarr = name.toCharArray();
		  for (int i = 0; i < chrarr.length; i++) {
		      if( !sb.toString().contains(chrarr[i]+"")) 
			  {sb.append(chrarr[i]);}
			  
			
		}
		  return sb.toString();
		  
	  }
	  
	  public static String removeDuplicateHashMap(String name){

		  StringBuilder sb = new StringBuilder();

		  char[] hasharr= new  char[26];
		  char[]  chrarr = name.toCharArray();
		  for (int i = 0; i < chrarr.length; i++) {
			  int t= chrarr[i]-65;
			  System.out.println("t->"+t);
			  if(hasharr[t]!=1 ) 
			  {sb.append(chrarr[i]);
			  hasharr[t]=1;
			  }
		  }
		  return sb.toString();

	  }
}
