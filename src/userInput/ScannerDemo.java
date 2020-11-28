package userInput;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        StringBuilder sb = new StringBuilder("Your Name is ");
        sb.append(scanner.nextLine());
        System.out.print("Enter Your Place: ");
        sb.append("\n"+"You Stay in ");
        sb.append(scanner.nextLine());
        System.out.println(sb);
    }
}
