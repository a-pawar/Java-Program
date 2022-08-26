// Write a Java program to convert a octal number to a hexadecimal number.


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
		int dec_num = (int) (a);

			int q;
			String s,hex_num="";
			char hex[] =new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			
			q = dec_num;
			while(q > 0){
				i=q%16;
				hex_num= hex[i] + hex_num;
				q = q/16;
			};
			
			System.out.print("Hexadecimal form: "+hex_num);
			
	}
}

