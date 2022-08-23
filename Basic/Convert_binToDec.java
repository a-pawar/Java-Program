//Write a Java program to convert a binary number to decimal number.
import java.util.Scanner;
import java.lang.Math;

class Convert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary num: ");
		Long bin = sc.nextLong();
		double a=0;
		int n,i=0;
		while(bin!=0){
			n=(int) (bin%10);
			bin=bin/10;
			a=Math.pow(2,i++) *n + a;
		}

		System.out.println(a);
	}
}
