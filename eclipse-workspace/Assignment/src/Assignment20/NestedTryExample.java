package Assignment20;

public class NestedTryExample {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};

            try {
                int result = arr[5]; // ArrayIndexOutOfBoundsException
                System.out.println(result);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index is out of bounds");
            }

            int x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}
