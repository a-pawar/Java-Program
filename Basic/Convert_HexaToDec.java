//Write a Java program to convert a hexadecimal to a decimal number.

import java.util.Scanner;
import java.lang.Math;

class Convert{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal num: ");
		String str = sc.next();
		double a=0;
		int n, j=str.length()-1;
		
		for(int i=0;i<str.length();i++){
			
			char c = str.charAt(j--);
			if(c >= 'a' && c <= 'e' ) {
				 n = c-87;
			}
			else if (c >= 'A' && c <= 'E'){
				n=c-55;
			}
			else{
				 n =Integer.parseInt(String.valueOf(c)); 
			}
			a=Math.pow(16,i) *n + a;
		}
		
		int a1 = (int) (a);
		System.out.println(a1);
	}
}

