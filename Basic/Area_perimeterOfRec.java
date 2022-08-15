//Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;
class Rectangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Width of Rec: ");
		double w = sc.nextDouble();
		System.out.print("Enter Height of Rec: ");
		
		double h = sc.nextDouble();
		System.out.println("Area of Rec: " + (w*h));
		System.out.println("Perimeter of Rec is: "+(2*(w+h)));

	}
}