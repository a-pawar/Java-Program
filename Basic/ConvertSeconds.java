//Write a Java program to convert seconds to hour, minute and seconds.

import java.util.Scanner;
class  ConvertSeconds{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter seconds: ");
		long sec = sc.nextLong();
		int hour =(int) sec/3600;
		int temp =(int) sec%3600;
		int min = temp/60;
		sec = temp%60;
		System.out.println("Time is "+hour+":"+min+":"+sec);
	}
}