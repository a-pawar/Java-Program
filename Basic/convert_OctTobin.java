// Write a Java program to convert a octal number to a binary number.

import java.util.Scanner;
import java.lang.Math;

class Convert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Octal num: ");
		Long bin = sc.nextLong();
		double a=0;
		int n,i=0;
		while(bin!=0){
			n=(int) (bin%10);
			bin=bin/10;
			a=Math.pow(8,i++) *n + a;
		}
		int dec = (int) (a);
		String s="";
		while(dec>=2){
			s = String.valueOf(dec%2)+s ;
			dec = dec/2;
		}
		 s =  String.valueOf(dec)+s;
		long l1 =Long.parseLong(s);
		System.out.println(l1);
	}
}

