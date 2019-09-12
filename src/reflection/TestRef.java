package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestRef {

	/**
	 * @param args
	 */
	
	public static void  printName(Object o){
		Class<?> c =o.getClass();
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
		
	}
	public static void main(String[] args) throws SecurityException, NoSuchMethodException {
		Simple s =new Simple();
		
		printName(s);
		


		
		//printName(s);
		try {
			Class<?> c= Class.forName("reflection.Simple");
			Simple sm=(Simple) c.newInstance();
			System.out.println(c.getSimpleName());
			
	        Class<Integer> d=int.class;
	        Class<?> st= "Manish".getClass();
	        
			System.out.println(d.isPrimitive());
			System.out.println(st.getSimpleName());
			
			//Method method = c.getDeclaredMethod("method Name",c);
			
			
			Constructor<?> [] constructor = c.getConstructors();
			System.out.println(constructor.length);
			Constructor<?> con= constructor[0];
			
			//dynamically creating the new obj
		  Object obj=null;
		  obj=con.newInstance();
		  
		  
		  Class<?> cl= obj.getClass();
		  System.out.println("Class Name:"+ cl.getSimpleName());
		  
		  Class<?> sup = cl.getSuperclass();
		  System.out.println("Super Class Name:"+ sup.getSimpleName());
		  
		  Package p =cl.getPackage();
		  System.out.println("Package:"+p.getName());
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
