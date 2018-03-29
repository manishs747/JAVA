import java.text.DecimalFormat;


public class DefaultR {

	public static void main(String[] args) {
	
		
		DecimalFormat df2 = new DecimalFormat("0.00");
		System.out.println(Double.parseDouble("0"));
		System.out.println(Double.parseDouble("0.0"));
		System.out.println(Double.parseDouble("0.00"));
		System.out.println(df2.format(Double.parseDouble("0.0000")));
		
		
	}

}
