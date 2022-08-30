//Write a Java program to compute the area of a hexagon.

import java.util.*;

 class Compute{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double area,s;
		System.out.print("Enter side: ");
		s = sc.nextDouble();
		
		area = (6 *Math.pow( s,2))/(4*Math.tan(Math.PI/6));
		System.out.print(area);
	}
}


