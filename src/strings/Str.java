package strings;

public class Str {

	public static void main(String[] args) {
		
		//String objects are stored in a special memory area known as string constant pool.
		/*the JVM checks the string constant pool first.
		If the string already exists in the pool, a reference to the pooled instance is returned.
	    If string doesn't exist in the pool, a new string instance is created and placed in the pool
        */

		String s2 = new String("manish");
		String s1 ="manish";
		String s3 ="manish";

		
       /*In such case, JVM will create a new string object in normal(non pool) heap memory and
		the literal "Welcome" will be placed in the string constant pool.
		The variable s will refer to the object in heap(non pool).*/
		
		if(s1==s3){
			System.out.println("s1 and s3 they are match");
		}else{
			System.out.println("s1 n s3 not equal");
		}
		
		String part1 = "Hello ";
		String part2 = "World";
		String word1 = part1 + part2;
		String word2 = "Hello World";//word1 will not be equal to word2 in memmory as compiler could not figure out that
		//"Hello World" already exist in memmory as word1 is determined at run time.

		if(word1==word2){
			System.out.println("They match");
		}else{
			System.out.println("They Dont Match");
		}

	}
	
	public static void substr(String str,int start,int end){
		String s1 = str.substring(start,end);
		String s2 = str.substring(end);
		System.out.println("s1 is "+s1);
		System.out.println("S2 is "+s2);
	}

}
