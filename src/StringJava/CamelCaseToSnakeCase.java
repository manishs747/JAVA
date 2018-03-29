package StringJava;

public class CamelCaseToSnakeCase {

	public static void main(String[] args) {
	
		System.out.println(replaceFromCameltoSnake("promoMsg"));

	}
	
	
	public static String replaceFromCameltoSnake(String str){
		if(str == null || str.isEmpty()){
			return str;
		}
		return str.replaceAll("([^_A-Z])([A-Z])", "$1_$2").toLowerCase(); 
	}

}
