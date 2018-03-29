package database;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class GetPropertyValues {
	
	String result = "";
	InputStream inputStream;
	
	public Properties getPropValues() throws IOException {
		    
			Properties prop = new Properties();
			String propFileName = "resource/config/config.properties"; 
			//getClass().getResourceAsStream(propFileName);
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			
			
			return prop;
		}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       GetPropertyValues g = new GetPropertyValues();
       try {
		System.out.println(g.getPropValues());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
