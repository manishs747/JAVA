package javaPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
         for (String s : args) {
        	 
              char[] ar = s.toCharArray();
              
           System.out.println(calcSimilarity(ar));
		}
         //System.out.println("Enter a string");
      
        
    }
    
    public static int calcSimilarity(char[] A){
		int count=0;
		for (int i = 0; i < A.length; i++) {
			for (int k=0,j = i; j < A.length; j++,k++) {
				//System.out.println("k:" + k + " j:"+j);
				if(A[k]==A[j]){
					count++;
				}
				else{
					break;
				}
			}
			//System.out.println("Count:"+ count);
		}
	
		//System.out.println("Final Count:"+ count);
		return count;
	}
    
    
    
    
}
