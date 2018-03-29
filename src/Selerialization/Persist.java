package Selerialization;

import java.io.*;


public class Persist {
	
	
	public static void main(String args[])throws Exception{  
	  Student s1 =new Student(211,"ravi");  
	  
	 // createSerilizedFile(s1);  
	  
	  readSerializedMethod();  
 
	 }

	private static void readSerializedMethod() throws IOException,
		 FileNotFoundException, ClassNotFoundException {
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		  Student s=(Student)in.readObject();  
		  System.out.println(s.id+" "+s.name);  
		  
		  in.close();
	}

	@SuppressWarnings("unused")
	private static void createSerilizedFile(Student s1)
			throws FileNotFoundException, IOException {
		  FileOutputStream fout=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.flush();  
		  System.out.println("success");
	}  

}
