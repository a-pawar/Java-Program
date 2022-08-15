// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Average {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		double avg = (a+b+c)/3.0;

		System.out.print("Average of num: ");
		System.out.format("%.4f", avg);
	}
} 