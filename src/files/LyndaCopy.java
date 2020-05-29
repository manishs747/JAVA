package files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class LyndaCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//getNetworkData();
		
		
		
		//copyFile();
		
	/*	File f1 = new File("loremipsum.txt");
		File f2 = new File("target.txt");
		try {
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//getCurrentDir();

	}

	public static void getCurrentDir() {
		String workingDir = System.getProperty("user.dir");
		   System.out.println("Current working directory : " + workingDir);
	}

	public static void getNetworkData() {
		try {
			URL url = new URL("http://polysyncronism.com/wordpress/?feed=comments-rss2");
			InputStream stream = url.openStream();
			BufferedInputStream buf = new BufferedInputStream(stream);
			StringBuilder sb = new StringBuilder();
			while(true){
				int data = buf.read();
				if(data==-1){
					break;
				}else{
					sb.append((char)data);
				}
				
			}
			System.out.println(sb);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void copyFile() {
		File f1 = new File("loremipsum.txt");
		File f2 = new File("target.txt");
		 
		
		try {
			InputStream in =new FileInputStream(f1);
			OutputStream out = new FileOutputStream(f2);
			
			byte[] buf =new byte[1024];
			int len;
			while((len=in.read(buf))>0){
				out.write(buf,0,len);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
