package assignment1;

import java.util.Scanner;
public class EvenOdd {


		public static void main(String args[]){
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number :");
			num = sc.nextInt();
			System.out.println("the number is :"+(num % 2 == 0 ? "even":"odd"));
		}
	}

