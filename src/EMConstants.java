
public enum EMConstants {
	January("jan"),Februry("feb"),March,April,May,June;
	
	private String value;
	
	EMConstants(String value)  //enum Constructor
	{
		System.out.println("Enum Constructor is called:"+ value);
		this.value=value;
	}
	EMConstants(){
		System.out.println("DEFAULT Constructor is called:"+ value);
	}
	public String value(){
		return value;
	}	

}
