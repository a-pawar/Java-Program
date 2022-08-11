//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.

import  java.util.Scanner;

class table{
	public static void main(String [] args){
		System.out.println("Enter number whose table to be printed: ");
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		for(int i = 1;i<=10;i++){
			System.out.println(t + "*" + i  + "=" + (t*i));
		}
	}
}
		 