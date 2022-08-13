//Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

class Circle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double r = sc.nextDouble();
		
		System.out.println("Perimeter of circle is: "+(2*3.1415*r));
		System.out.println("Area of cicle: " + (3.1415*r*r));
	}
}
