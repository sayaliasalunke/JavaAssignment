package Assignment19;

import java.util.Scanner;

public class DivideByZeroExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Program continues...");
    }
}
