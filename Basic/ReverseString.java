//Write a Java program to reverse a string.
import java.util.Scanner;
class ReverseString{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string: ");
	String str=sc.nextLine();
	StringBuilder sb = new StringBuilder(str);
	sb.reverse();
	System.out.println(sb);
	}
}
	