package numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat {


    public static void main(String[] args) {

        printAllFormat(Locale.UK);
        printNumber(Locale.UK);
        printNumber(Locale.US);
        printNumber(Locale.FRANCE);
        printNumber(Locale.JAPAN);
        printNumber(Locale.ENGLISH);
    }

    static void printAllFormat(Locale locale) {
        double dbl = 1_235_567.89;
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF.format(dbl));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(dbl));

        NumberFormat intF = NumberFormat.getIntegerInstance(locale);
        System.out.println("Integer: " + intF.format(dbl));

        System.out.println("******************************************************************");
    }

    static void printNumber(Locale locale){
        double dbl=105000.3245;
        NumberFormat formatter=NumberFormat.getNumberInstance(locale);
        String number=formatter.format(dbl);
        System.out.println(number+" for the locale "+locale);
    }
}
