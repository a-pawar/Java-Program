// Write a Java program to convert a decimal number to a binary number.
import java.util.Scanner;
import java.io.*;


class Convert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal num: ");
		int dec = sc.nextInt();
		String a="";
		while(dec>=2){
			a = String.valueOf(dec%2)+a ;
			dec = dec/2;
		}
		 a =  String.valueOf(dec)+a;
		System.out.println(a);
	}
}