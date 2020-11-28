package numbers;

public class Operator {

    public static void main(String[] args) {

        int intvalue = 10;
        System.out.println("intvalue++ : "+   intvalue++);
        System.out.println("intvalue after ++ : "+intvalue);

        intvalue = 10;
        System.out.println("++intvalue : "+ ++intvalue);


        intvalue = 10;
        intvalue += 5 ;//15 (a = a + 5)
        System.out.println("intvalue += 5 : "+ intvalue);



    }
}
