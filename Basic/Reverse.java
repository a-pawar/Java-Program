//Write a Java program to reverse a word.
import java.util.Scanner;
class Reverse{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = sc.next();
		String reverse="";
		for(int c=str.length()-1;c>=0;c--){
			reverse += str.charAt(c);
		}
		System.out.println("Reverse String: "+reverse);
	}
}