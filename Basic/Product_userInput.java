//5. Write a Java program that takes two numbers as input and display the product of two numbers.
import java.util.Scanner;

class input{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int fnum = sc.nextInt();
		
		System.out.print("Enter second Number: ");
		int snum = sc.nextInt();	

		int ans = fnum*snum;

		System.out.println(fnum + " * " + snum	+ " = " + ans);
	}
}
		
