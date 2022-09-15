//Write a Java program to capitalize the first letter of each word in a sentence

import java.util.Scanner;
class  Capitalize{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string in lower case: ");
		String str = sc.nextLine();
		String [] s = str.split(" ");
		String cap = "";
		for(String var : s){
			cap += Character.toUpperCase(var.charAt(0)) + var.substring(1)+" ";
		}	
		System.out.println(cap);
		
	}
}