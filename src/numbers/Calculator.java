package numbers;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number:");
        int n1 = sc.nextInt();
        System.out.print("Enter Second number:");
        int n2 = sc.nextInt();
        System.out.print("Enter 1:ADD , 2:SUB, 3:MUL 4:DIV: ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                int sum = n1+n2;
                System.out.println(n1+" + "+n2 +" = "+sum);
                break;
            case 2:
                int sub = n1-n2;
                System.out.println(n1+" - "+n2 +" = "+sub);
                break;
            case 3:
                int mul = n1*n2;
                System.out.println(n1+" * "+n2 +" = "+mul);
                break;
            case 4:
                int div = n1/n2;
                System.out.println(n1+" / "+n2 +" = "+div);
                break;
            default:
                System.out.println("invalid value");
        }




    }
}
