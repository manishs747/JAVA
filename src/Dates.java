import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Dates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//genetreCurent();  
		genetreCurentMilli();
		genetreCurentMilliSql();
		genetreCurentCalendar();
		
		gregorian();

	}

	public static void gregorian() {
		GregorianCalendar gc = new GregorianCalendar(2009,1,28);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime();
		
		DateFormat df = DateFormat.getDateInstance();
		String sd     =     df.format(d2);
		System.out.println(sd);
	}

	public static void genetreCurent() {
		 Date date = new Date();  
		System.out.println(date);
	}
	
	public static void genetreCurentMilli() {
		long millis=System.currentTimeMillis();  
		java.util.Date date=new java.util.Date(millis);  
		System.out.println(date); 
	}
	
	public static void genetreCurentMilliSql() {
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		System.out.println(date);
	}
	
	public static void genetreCurentCalendar() {
		Calendar cal =Calendar.getInstance();
		Date date= cal.getTime();  
		System.out.println(date);  
	}
	
	
	
	
	  

}
