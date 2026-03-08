package Assignment19;

public class NestedTryExample {

    public static void main(String[] args) {

        try {

            int a = 10 / 2;
            System.out.println("Result = " + a);

            try {
                int arr[] = new int[3];
                arr[5] = 10;
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index error.");
            }

        }

        catch (Exception e) {
            System.out.println("Outer catch: General exception.");
        }

        System.out.println("Program ended.");
    }
}
