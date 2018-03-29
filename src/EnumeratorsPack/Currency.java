package EnumeratorsPack;


//The enum constants are static and final implicitely
// Enums can be thought of as classes that have fixed set of constants

public enum Currency {
	PENNY("penny"), NICKLE("nic"), DIME("dime"), QUARTER("quarter");
	private String value ;
	
	Currency(String value) {
		this.value = value;
		//System.out.println("COnstruct is called:"+value);
	}
	
	@Override
	public String toString() {
		return this.value;
	}
	
	public int samp() {
		 System.out.println("hello");
		 return 1;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Currency.DIME.name());
		/*for (Currency enu : Currency.values()) {
			System.out.println(enu);
			//System.out.println(Currency.values()[0]);
			
			
		}*/
		
	}
	
	
}


