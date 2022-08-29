//Write a Java program and compute the sum of the digits of an integer.
import java.util.Scanner;

public class SumOfDigites{
	public static void main(String [] args){
		int num,rem,sum=0;
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num != 0){
			rem = num%10;
			num = num/10;
			sum =sum+ rem;
		}
		System.out.println(sum);
	}
}