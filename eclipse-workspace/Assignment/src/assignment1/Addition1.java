package assignment1;

import java.util.Scanner;
public class Addition1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Addition is :"+(a+b));
		
	}
}
