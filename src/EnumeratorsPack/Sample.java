package EnumeratorsPack;

public class Sample {

	public enum NewCurrency {
		PENNY("penny"), NICKLE("nicky"), DIME("dime"), QUARTER("quarter");
		private String value ;
		
		NewCurrency(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return this.value;
		}
		
		
		public static void main(String[] args) {
			
			
			for (Currency enu : Currency.values()) {
				System.out.println(enu.toString());
				
			}
			
		}
		
		
	}

	
	/*public static void main(String[] args) {
		System.out.println(NewCurrency.DIME);
	}*/
	

}
