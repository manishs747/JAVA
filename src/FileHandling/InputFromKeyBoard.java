package FileHandling;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromKeyBoard {

	public static void inputStramReaderMethod(){
		
		try {
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			System.out.println("Enter Name");
			String name = br.readLine();
			System.out.println("Your Name is " + name);
			br.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
		//	br.close();
			
		}
		
	
	}
	
	
	
	public static void consoleMethod() {

		 
		try {
			System.out.println("Enter your name: ");  
			Console c=System.console(); 
			String n=c.readLine();  
			System.out.println("Welcome "+n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
		} 
		
	
	
	}
	
	
	public static void scannerMethod() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Your Name is " + name + " Age is " + age);
		sc.close();

	}
	
	
	
	public static void main(String[] args) {
	
		//inputStramReaderMethod();
		
		consoleMethod();
		//scannerMethod();

	}

}
