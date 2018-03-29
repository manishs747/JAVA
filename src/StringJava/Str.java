package StringJava;

public class Str {

	public static void main(String[] args) {
		
		//String objects are stored in a special memory area known as string constant pool.
		/*the JVM checks the string constant pool first.
		If the string already exists in the pool, a reference to the pooled instance is returned.
	    If string doesn't exist in the pool, a new string instance is created and placed in the poo
        */
		String s1 ="manish";
		
       /*In such case, JVM will create a new string object in normal(non pool) heap memory and
		the literal "Welcome" will be placed in the string constant pool.
		The variable s will refer to the object in heap(non pool).*/
		String s2 = new String("manish");
		String s3="manish";
	
		
		if(s1==s3){
			System.out.println(" s1 n s3they r equal");
		}else{
			System.out.println("s1 n s3 not equal");
		}
		
		substr("Sachin Tendulkar",0,6);

	}
	
	public static void substr(String str,int start,int end){
		String s1 = str.substring(start,end);
		String s2 = str.substring(end);
		System.out.println("s1 is "+s1);
		System.out.println("S2 is "+s2);
	}

}
