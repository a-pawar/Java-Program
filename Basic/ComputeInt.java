//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

import java.util.Scanner;
class Compute{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();

		System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);
		int m = n + 11 * n + 111 * n;
		System.out.print(m);
	}
}
