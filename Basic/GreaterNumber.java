//Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number. 

import java.util.Scanner;
class  GreaterNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 number:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Result : "+greater(a,b,c,true));
	}
	public static boolean greater(int a,int b,int c,boolean abc){
		
		if(abc){
			return (c>b);
		}
		return (b>a && c>b);
			
	}
}

