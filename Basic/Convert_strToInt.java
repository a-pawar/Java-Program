//Write a Java program to convert a string to an integer in Java.

import java.util.Scanner;
class  Convert{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		String str = sc.next();
		
		int i = Integer.parseInt(str);
		System.out.println("integer form:"+i);

	}
}
