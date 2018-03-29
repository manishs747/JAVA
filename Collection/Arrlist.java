import java.util.ArrayList;


public class Arrlist {
	
	
	
	public static void main(String[] args) {
		ArrayList<String>  name = new ArrayList<String>();
		name.add(0,"manish");
		name.add(0,"rajnish");
		ArrayList<String>  list = new ArrayList<String>();
		list.addAll(name);
		System.out.println(list);
		
		
		
		
	}

}
