package files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeOutput {

	
	public static void main(String[] args) {
		//fileOutputMethod();
		//fileInputMethod();
		//readAndWrite();
		//readAndWriteBuffered();
		scanner();

	}
	
	
	public static void scanner(){
		try {
			
			File f1 = new File("1.txt");
			File f2 = new File("2.txt");
			
			//FileInputStream fin =  new FileInputStream("1.txt");
			BufferedReader in = new BufferedReader(new FileReader(f1));
			Scanner s = new Scanner(in);
			
			
	
			while (s.hasNext()) {
				System.out.println(s.next());
			}
			in.close();
		
			System.out.println("Sucess");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void readAndWriteBuffered(){
		try {
			
			File f1 = new File("1.txt");
			File f2 = new File("2.txt");
			
			//FileInputStream fin =  new FileInputStream("1.txt");
			BufferedReader in = new BufferedReader(new FileReader(f1));
			BufferedWriter out =new BufferedWriter( new FileWriter(f2));
			
			
			/*//using apache
			FileUtils.copyFile(f1,f2);*/
			
			int i= 0;
			while ((i=in.read())!=-1) {
				out.write(i);
			}
			in.close();
			out.close();
			System.out.println("Sucess");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void readAndWrite(){
		try {
			
			File f1 = new File("1.txt");
			File f2 = new File("2.txt");
			
			//FileInputStream fin =  new FileInputStream("1.txt");
			FileInputStream fin =  new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			
			
			/*//using apache
			FileUtils.copyFile(f1,f2);*/
			
			int i= 0;
			while ((i=fin.read())!=-1) {
				fout.write((byte)i);
			}
			fin.close();
			fout.close();
			System.out.println("Sucess");
			
			String s;
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void readAndWriteByte(){
		try {
			
			File f = new File("1.txt");
			//FileInputStream fin =  new FileInputStream("1.txt");
			FileInputStream fin =  new FileInputStream(f);
			FileOutputStream fout = new FileOutputStream("2.txt");
			
			
			byte [] buf = new byte[1024];
			int len;
			while ((len=fin.read(buf)) != -1) {
				fout.write(buf,0,len);
			}
			fin.close();
			fout.close();
			System.out.println("Sucess");
			
			String s;
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public static void fileInputMethod(){
		try {
			FileInputStream in =  new FileInputStream("1.txt");
			BufferedInputStream  fin = new BufferedInputStream(in);
			
			int i= 0;
			while ((i=fin.read())!=-1) {
				System.out.println((char)i);
				
			}
			fin.close();
			System.out.println("Sucess");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void fileOutputMethod(){
		try {
			FileOutputStream out =  new FileOutputStream("1.txt");
			String s = "a MY name is Manish";
			byte[] b = s.getBytes();
			BufferedOutputStream fout = new BufferedOutputStream(out);
			
			/*ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write(239);
			bout.writeTo(fout);*/
		
			fout.write(b);
			fout.close();
			System.out.println("Sucess");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
