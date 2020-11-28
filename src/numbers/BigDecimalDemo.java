package numbers;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BigDecimalDemo {

    public static void main(String[] args) {
         double val = 0.012;
        double pSum = val+val+val;
        System.out.println("Psum = "+pSum);//0.036000000000000004

        BigDecimal bigValue = new BigDecimal(Double.toString(val));
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("New Psum :"+bSum.toString());
    }

    public static class NumberFormating {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            double i = 47456.23456;
             String r1 = String.format("i have %,6.2f", i);
             System.out.println(r1);
             String r2 = String.format("i have %,6.1f", 4.12);
             System.out.println(r2);
             String r3 = String.format("i have %c", 42);
             System.out.println(r3);
             String r4 = String.format("i have %x", 42);
             System.out.println(r4);


        }

    }

    public static class Dates {

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
            Date date=new Date(millis);
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
}
