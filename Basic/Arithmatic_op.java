// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 

import java.util.Scanner;
class Arith{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int x=sc.nextInt();                        

		System.out.print("Enter second number: ");
		int y=sc.nextInt(); 
		
		System.out.println(x + "+" + y + "=" + (x+y));
		System.out.println(x + "-" + y + "=" + (x-y));
		System.out.println(x + "*" + y + "=" + (x*y));
		System.out.println(x + "/" + y + "=" + (x/y));
		System.out.println(x + "%" + y + "=" + (x%y));
	}
}
		

