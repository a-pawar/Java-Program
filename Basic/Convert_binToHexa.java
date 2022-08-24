//Write a Java program to convert a binary number to Hexadecimal number.
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
			int dec_num,q;
			i=0;
			String a,hex_num="";
			char hex[] =new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			dec_num =(int) (d);
			
			q = dec_num;
			if(q==0){
				hex_num="0";
			}
			while(q > 0){
				i=q%16;
				hex_num= hex[i] + hex_num;
				q = q/16;
			};
			
			System.out.print("Hexadecimal form: "+hex_num);
	}
}
