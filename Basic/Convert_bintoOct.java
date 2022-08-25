//Write a Java program to convert a binary number to a Octal number.

import java.util.Scanner;
import java.lang.Math;

class Convert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary num: ");
		Long bin = sc.nextLong();
		double d=0;
		int n,i=0;
		while(bin!=0){
			n=(int) (bin%10);
			bin=bin/10;
			d=Math.pow(2,i++) *n + d;
		}
		int dec,q;
		i =0;
		String s ="";
		dec = (int) (d);
		q=dec;

		while(q!=0){
			
			s = String.valueOf(q%8)+s ;
			q = q / 8;
			
			i++;
		}
		if(dec==0){
			s="0";
		}
		System.out.print("Octal Value : ");  
		System.out.println(s);
	}
}
