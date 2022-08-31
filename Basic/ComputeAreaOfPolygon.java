//35. Write a Java program to compute the area of a polygon.
//Area of a polygon = (n*s^2)/(4*tan(π/n))
//where n is n-sided polygon and s is the length of a side
import java.util.*;

 class Compute{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double area,s;
		int n;
		final int pi = 180;
		System.out.print("Input the length of one of the sides,s: ");
		s = sc.nextDouble();
		System.out.print("Input the number of sides on the polygon,n: ");
		n = sc.nextInt();
		area = (n*Math.pow( s,2))/(4.0*Math.tan(Math.PI/n));
		System.out.print(area);
	}
}


