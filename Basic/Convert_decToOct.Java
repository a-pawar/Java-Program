// Write a Java program to convert a decimal number to octal number.
import java.util.Scanner;

class Convert{
	public static void main(String [] args){
		int dec,i =0,q;
		String s ="";
		Scanner sc  = new Scanner (System.in);
		System.out.print("Enter a Decimal number: ");
		dec = sc.nextInt();
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