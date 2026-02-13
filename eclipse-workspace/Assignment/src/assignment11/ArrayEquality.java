package assignment11;

import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        if(n1 != n2) {
            System.out.println("Arrays are not equal.");
            return;
        }

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean equal = true;

        for(int i = 0; i < n1; i++) {
            if(arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }

        if(equal)
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }
}
