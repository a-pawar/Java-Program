//Write a Java program to print the ascii value of a given character.

import java.util.Scanner;
class AsciiValue{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int i = ch;
		System.out.println("The ASCII value of Z is : "+i);
	}
}