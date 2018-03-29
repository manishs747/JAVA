package javaPractice;

public class StringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strBuffer();
	}
	
	
	public static  void subSTR(){
		
		String name ="manish Singh";
		String subname =name.substring(7);
		System.out.println(subname);
	}
	
	public static void strBuffer(){
		
		
		StringBuffer buffer = new StringBuffer("Hello");
		//buffer.append("java");
		buffer.replace(1, 2, "java");
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
	}

}
