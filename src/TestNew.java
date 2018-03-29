import java.time.LocalDate;





public class TestNew {

	public static void main(String[] args) {
	
		 String inArray[] = "3,1,2".split(",");
		 try {
			for (int i = 0; i < inArray.length; i++) {
				 System.out.println(Byte.parseByte(inArray[i]));	
			  }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    

	}

}
