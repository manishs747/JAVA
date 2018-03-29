
public class Student implements Comparable<Student> {

	int rollno;  
	String name;  
	int age; 
	
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		//Student st=(Student)obj;
		if(this.age==st.age)  
			return 0;
		else if(this.age>st.age)  
			return 1; 
		else  
			return -1; 
	}
	
	
	/*		@Override
public String toString() {
	
		return this.name+" "+this.rollno+" "+age;
	}*/
	
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "a", 1);
		Student s2 = new Student(1, "a", 1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1);
		System.out.println(s2);
	}

}
