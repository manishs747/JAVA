package files;

import java.io.File;
import java.io.IOException;
public class Createfile {
	
	 public static void main( String[] args )
	    {	
	    	// File file = new File("C:\\somefile.txt");
		      boolean var = new File("C:\\LuceneIndexing").mkdir();
		      //C:\\Users\Virima\Documents\Java_Practice\dct\temp\index\write.lock
	 
		      if (var){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
	    }

}



 
