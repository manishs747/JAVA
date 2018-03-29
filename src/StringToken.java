

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.StringTokenizer;
public class StringToken {
	
	public static String fancySubstring(int beginIndex, String original)
    {
        return new String(original.substring(beginIndex));
    }
	
	public static void subStringWithoutMemmoryLeak(){
		
		//Our main String
        String mainString = "i_love_java";
        //Substring holds value 'java'
         String subString = fancySubstring(7, mainString);
       // String subString = mainString.substring(7);
        System.out.println(mainString);
        System.out.println(subString);
 
        //Lets see what's inside mainString
        try {
			Field innerCharArray = String.class.getDeclaredField("value");
			innerCharArray.setAccessible(true);
			char[] chars = (char[]) innerCharArray.get(mainString);
			System.out.println(Arrays.toString(chars));
 
			//Now peek inside subString
			chars = (char[]) innerCharArray.get(subString);
			System.out.println(Arrays.toString(chars));
			
			
			
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	
	public static void main(String[] args) {/*
		String str = "This is String , split by StringTokenizer, created by mkyong";
		StringTokenizer st = new java.util.StringTokenizer(str);
		System.out.println("---- Split by space ------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		System.out.println("---- Split by comma ',' ------");
		StringTokenizer st2 = new StringTokenizer(str, ",");
		 
		while (st2.hasMoreElements()) {
			System.out.println(st2.nextToken());
		}
*/
		
        subStringWithoutMemmoryLeak();
	}

}
