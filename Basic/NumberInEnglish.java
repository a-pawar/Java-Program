// Write a Java program than read an integer and calculate the sum of its digits and write the number of each digit of the sum in English.

import java.util.Scanner;
class Number {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String str = sc.next();
		char[] num1 = str.toCharArray();
		int sum=0;
		for(int i=0;i<=num1.length-1;i++){
			sum +=(num1[i])-'0';
		}
		
		System.out.println("Sum is "+sum);
		printNumber(sum);
	}
	public static void  printNumber(int n){
		String[] str={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		int x,y,z;
		if(n<10){
			System.out.print("Number is: "+ str[n]);
		}
		else if(n<100){
			x=n/10;
			y=n-x*10;
			System.out.print("Number is: "+ str[x]+" "+str[y]);
		}
		else{
			x=n/100;
			y=(n-x*100)/10;
			z=n-x*100-y*10;
			System.out.print("Number is: "+ str[x]+" "+str[y]+" "+str[z]);
			
		}
	}
}