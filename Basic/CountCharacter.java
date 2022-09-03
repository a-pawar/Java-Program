//Write a Java program to count the letters, spaces, numbers and other //characters of an input string.
import java.util.Scanner;

class Count1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		int letter=0,space=0,digit=0,other=0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				letter++;
			}
			else if(Character.isWhitespace(ch)){
				space++;
			}
			else if(Character.isDigit(ch)){
				digit++;
			}
			else {
				other++;
			}
		}	
		System.out.println("Total Letter: "+letter);
		System.out.println("Total Digit: "+digit);
		System.out.println("Total Space: "+space);
		System.out.println("Total other: "+other);	
	}
}
		