package strings;
import java.util.StringTokenizer;;

public class StringTokenizers {
public static void main(String[] args) {
	  StringTokenizer st = new StringTokenizer("my name is khan"," ");  
	   while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     } 
	   }
}


