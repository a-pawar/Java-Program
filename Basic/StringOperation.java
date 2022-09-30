//Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more.

import java.util.Scanner;
class  StringOperation{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = sc.next();
		String s1="";
		for(int i=str.length()-1;i>=(str.length()-3);i--){
			s1= str.charAt(i)+s1;
		}
		s1=s1+str+s1;
		System.out.println(s1);
	}
}