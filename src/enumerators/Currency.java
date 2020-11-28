package enumerators;


//The enum constants are static and final implicitly
// Enums can be thought of as classes that have fixed set of constants

public enum Currency {
	PENNY("pny",1), NICKLE("nic",5), DIME("dime",10), QUARTER("quarter",25);
	private String shortName;
	private int denomination;
	
	Currency(String value,int den) {
		System.out.println("Enum Constructor is called with val:"+value+" den: " + den);
		this.shortName = value;
		this.denomination = den;
	}

	@Override
	public String toString() {
		return this.name()+"::"+this.shortName +":"+denomination;
	}

	
	public static void main(String[] args) {

		for (Currency enu : Currency.values()) {
			System.out.println("ENUM:"+enu+" with Shortname:"+enu.shortName);
		}
		
	}
	
	
}


