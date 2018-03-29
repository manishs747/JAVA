import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Collectionsorting {

	
	public static void main(String[] args) {
		
		
		
		//sortCharachter();
        
        //sortString();
         
       // sortStudentComparable();
		
		List<Student> al = new ArrayList<Student>();  
	       
        al.add(new Student(101,"Vijay",23));  
        al.add(new Student(106,"Ajay",27));  
        al.add(new Student(105,"Jai",21));  
          
        Collections.sort(al,new NameComparator()); 
        System.out.println(al);
        
        Collections.sort(al,new AgeComparator()); 
        System.out.println(al);
	}

	public static void sortStudentComparable() {
		List<Student> al = new ArrayList<Student>();  
       
        al.add(new Student(101,"Vijay",23));  
        al.add(new Student(106,"Ajay",27));  
        al.add(new Student(105,"Jai",21));  
          
        Collections.sort(al); 
        System.out.println(al);
	}

	public static void sortCharachter() {
		String original = "edcba";
		char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
	}

	public static void sortString() {
		ArrayList<String> al=new ArrayList<String>();  
        al.add("Viru");  
        al.add("Saurav");  
        al.add("Mukesh");  
        al.add("Tahir");  
        Collections.sort(al); 
        
        System.out.println(al);
	}
}
