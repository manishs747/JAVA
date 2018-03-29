package Reflection;

import java.lang.reflect.Field;

public class Trim {
	
	
	public static Object trimStringValues(Object obj){
		for(Field field : obj.getClass().getDeclaredFields()){
			try{
				field.setAccessible(true);
				Object value = field.get(obj);
				if(value != null){
					if(value instanceof String){
						String trimmed = (String) value;
						field.set(obj, trimmed.trim());
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student  s1 = new Student("      manish ", null, 4);
		System.out.println(s1);
		s1 = (Student) trimStringValues(s1);
		System.out.println(s1);
	}

}
