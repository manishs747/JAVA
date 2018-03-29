import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;



public class ArrayIteration {
	
	
	
	public static void main(String[] args) {
	   String [] ar = {"900","90","9","0.9","0.09","0.009"};
	   for (String str : ar) {
		   DecimalFormat formatter = new DecimalFormat("####.#######");
		 
		  // String l = formatter.format(DefaultR.parseDouble(str)/100.00);
		   //String.format(format, args)(d/100)
		 // System.out.println( l);
	    }
	   
	}

}
