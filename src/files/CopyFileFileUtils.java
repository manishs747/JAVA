package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class CopyFileFileUtils {
	
public static void main(String[] args) {
		
		try {
			File f1 = new File("C:/Users/Virima/Desktop/current work.txt");
			File f2 = new File("Target.txt");
			FileUtils.copyFile(f1, f2);
			System.out.println("file copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}

}
