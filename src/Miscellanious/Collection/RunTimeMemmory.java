package Miscellanious.Collection;

import java.util.ArrayList;
import java.util.List;

public class RunTimeMemmory {

	 private static final long MEGABYTE = 1024L * 1024L;

	  public static long bytesToMegabytes(long bytes) {
	    return bytes / MEGABYTE;
	  }
	  
	  public static void main(String[] args) {
	
		   
		   List<Bird> list = new ArrayList<Bird>();
		    for (int i = 0; i <= 1; i++) {
		      list.add(new Bird());
		    }
		    // Get the Java runtime
		    Runtime runtime = Runtime.getRuntime();
		    // Run the garbage collector
		    runtime.gc();
		    // Calculate the used memory
		    System.out.println("Total Memmory:"+ runtime.totalMemory() +" in MB:"+ bytesToMegabytes(runtime.totalMemory()));
		    long memory = runtime.totalMemory() - runtime.freeMemory();
		    System.out.println("Used memory is bytes: " + memory+ " In MB:"+bytesToMegabytes(memory));

	}

}
