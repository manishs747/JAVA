package numbers;


/*

byte 1 byte -128 to 127.
short 2 bytes -32,768 to 32,767.
int 4 bytes -2,147,483,648 to 2,147,483,647.
long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80.
float 4 bytes 7 decimal digits.
double 8 bytes 16 decimal digits.
 */
public class Main {

    public static void main(String[] args) {

       int intVal = 1024;
       byte b = (byte) intVal;
       System.out.println("Byte value for 1024 is: "+b);//return 0


        double floatValue = 3.9999;
        intVal = (int) floatValue;
        System.out.println("Int  value for 3.9999 is: "+intVal);//return 3

    }





}
