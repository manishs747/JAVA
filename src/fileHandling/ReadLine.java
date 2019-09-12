package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadLine {

	public static void readLine(String Filename){
		try {
			File file = new File("Target.txt");
			//System.out.println(file);
			FileReader in = new FileReader(file);
			//System.out.println(in);
			BufferedReader  br = new BufferedReader(in);
			String line;
			 
			//System.out.println("hewllo");
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		public static void writeFile(String Filename){
			try {
				File file = new File("3.txt");
				//System.out.println(file);
				FileWriter fw = new FileWriter(file);
				
				
			/*	
			    PrintWriter writer = new PrintWriter(file);
				writer.write("my name is manish");
				writer.println("my name is m");  //it prints in new file
*/			
			    fw.write("my name is manish");
				fw.flush();
				fw.close();
				//writer.close();
				
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readLine("sample.txt");
		writeFile("");
	}

}
