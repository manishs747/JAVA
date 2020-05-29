package files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Balaguruswamy {
	
	
	
	public static void sequence(){
		FileInputStream s1;
		try {
			s1 = new FileInputStream("1.txt");
			FileInputStream s2 = new FileInputStream("2.txt");
			SequenceInputStream s = new SequenceInputStream(s1, s2);
			BufferedInputStream bin = new BufferedInputStream(s);
			
			BufferedOutputStream bout = new BufferedOutputStream(System.out);
			int c;
			while((c=bin.read())!=-1){
				bout.write((char)c);
				
			}
			
			s1.close();
			s2.close();
			s.close();
			bin.close();
			bout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void writeReadPrimitive(){
		File primitive = new File("prim.txt");
		try {
			FileOutputStream out = new FileOutputStream(primitive);
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeInt(1956);
			dos.writeInt(1957);
			dos.writeDouble(375.46);
			dos.writeBoolean(false);
			dos.writeChar('X');
			dos.close();
			out.close();
			FileInputStream in  = new FileInputStream("prim.txt");
			DataInputStream dis = new DataInputStream(in);
			System.out.println(dis.readInt());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			dis.close();
			in.close();
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void writeByte(){
		String c = "Delhi\nMadras";
		
		byte [] cities ={'D','E','L','H','I'};
		try {
			FileInputStream  fin = new FileInputStream("2.txt");
			FileOutputStream fout = new FileOutputStream("3.txt");
			int b=0;
			while((b=fin.read())!=-1){
				fout.write((byte)b);
			}
			
			
			fout.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void copyCharacter(){
	File inFile = new File("1.txt");
	File outFile = new File("2.txt");	
	FileReader in = null;
	FileWriter out = null;
	
	
	try {
		 in = new FileReader(inFile);
		 
		 BufferedReader  br = new BufferedReader(in);
		 
		 out = new FileWriter(outFile);
		 int c;
		 while((c=br.read())!=-1){
			 out.write(c);
		 }
		 
		 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		
		try {
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//copyCharacter();
		//writeByte();
		//writeReadPrimitive();
		sequence();
	}

}
