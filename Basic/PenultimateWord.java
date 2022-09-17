//Write a Java program to find the penultimate (next to last) word of a sentence.
import java.util.Scanner;
class PenultimateWord{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.nextLine();
		String [] s1 = str.split(" ");
		System.out.println("Penultimate word: "+s1[s1.length-2]);
	}
}