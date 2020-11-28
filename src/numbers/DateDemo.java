package numbers;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {


    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        /*it is an old date system in which month starts from 0 .so 1 is for feb .month starts from 0 to 11  */
        GregorianCalendar gc = new GregorianCalendar(2009,1,28);//
        System.out.println(gc.getTime());
        gc.add(GregorianCalendar.DATE,1);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        /* LocalDate date is new date api month starts from 1 to 12   */
        LocalDate ld = LocalDate.of(2009,1,28);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ld));


    }
}
