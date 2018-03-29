package EnumeratorsPack;

public enum Month {
	JAN("january"), FAB("feburary"), MAR("MARCH");
	private String value ;
	
	Month(String value) {
		this.value = value;
		System.out.println("COnstruct is called:"+value);
	}

}
