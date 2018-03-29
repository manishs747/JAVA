import java.util.ArrayList;


public class Alclass {

	
	    
	    public void PrintAlphabet(){
	    	for(int i='a';i<='z';i++){
      		System.out.print((char)i);
	    		if(i!='z'){
	    			System.out.print(" , ");
	    		}
	    		
	    	}
	    }
	    
	public static void main(String[] args) {
		Alclass o = new Alclass();
		o.PrintAlphabet();
		/*ArrayList<String> str = new ArrayList<String>();
		str.add("manish");
		str.add("rajnish");
		str.add("preeti");
		System.out.println(str);
		str.set(0,"rocky");
		System.out.println(str.size());
		System.out.println(str.get(0));
		System.out.println(str.indexOf("rajnish"));
		for(String s: str)
		{
			System.out.println(s);
		}*/
		

	}

}
