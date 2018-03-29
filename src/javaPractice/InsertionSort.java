package javaPractice;

/* Head ends here */
import java.util.*;
public class InsertionSort {
       
          static void insertionSort(int[] ar) {
        	  for (int i = 1; i < ar.length; i++) {
        		  
        		  int key = ar[i];
        		  //System.out.println("key:" + key);
        		  //insereting in sorted array  0 to i-1
        		  for (int j = i-1; j>=0; j--) {
					if(ar[j]>key){
						ar[j+1]=ar[j];
					}
					else{
						
						break;
					}
					ar[j]=key;
					//printArray(ar);
				}
        		  
        		  printArray(ar);
			}
        	  
        	
                 
        	 }
         
          
          static void insertionSortWhile(int[] ar) {
        	  for (int i = 1; i < ar.length; i++) {
        		  
        		  int key = ar[i];
        		  System.out.println("key:" + key);
        		  //insereting in sorted array  0 to i-1
        		  int j=i-1;
        		  System.out.println("j:" + j );
        		  System.out.println("ar[j]:" + ar[j] );
        		  while(j>=0&&(ar[j]>key)){
        			  
        			  ar[j+1]=ar[j];
        			  System.out.println(ar[j]+ " , "+ar[j+1]);
        			  j=j-1;
        		  }
					ar[j+1]=key;
					System.out.println("j->"+j + "value:"+ key);
					printArray(ar);
				}
        		  
        		//  printArray(ar);
			}
        	  
        	
                 
        	 

/* Tail starts here */
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
          
           int[] ar = {3,2,7,6,11,9};
          
           insertionSortWhile(ar);
          
       }    
   }
