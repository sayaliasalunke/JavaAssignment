package Assignment19;

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Exception handled: Cannot divide by zero.");
        }

        finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program finished.");
    }
}
