// Write a Java program to convert a decimal number to a hexadecimal number.

import java.util.Scanner;
class Convert{
		public static void main(String [] args){
			int dec_num,q,i;
			String a,hex_num="";
			char hex[] =new char[] {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter decimal Number: ");
			dec_num = sc.nextInt();
			
			q = dec_num;
			while(q > 0){
				i=q%16;
				hex_num= hex[i] + hex_num;
				q = q/16;
			};
			
			System.out.print("Hexadecimal form: "+hex_num);
			
	}
}


