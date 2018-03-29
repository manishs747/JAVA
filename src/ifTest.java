

public class ifTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	ifTest obj1 =  new ifTest(1,"manish");
	ifTest obj2 =  new ifTest(2,"Rajnish");
    // Print(obj1);
 	String DefaultYypes = "OS; IP address;";
	Boolean some =  DefaultYypes.contains("IPaddress");
	System.out.println(some);
}
	int key;
	String value;
	public ifTest(int a,String b)
	{
		key = a;
		value = b;
	}

		
		public static  void Print(ifTest s){
			System.out.println(s.key);
			System.out.println(s.value);
			}
		
	}

	
	


