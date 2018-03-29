import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;


public class EpocTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(convertLocalDateTimeToEpochTime(LocalDateTime.now()));
		System.out.println(System.currentTimeMillis());

	}
	
	 public static long convertLocalDateTimeToEpochTime(LocalDateTime ldt) {

	        ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
	        Date output = Date.from(zdt.toInstant());

	        return output.getTime();
	    }

}
