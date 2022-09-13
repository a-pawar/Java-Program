//Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.
import java.util.Scanner;
class  CheckRightmostdigit{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter 3 number: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Result : "+check(a,b,c));
	}
	public static boolean check(int a,int b,int c){
		
		if((a%10 == b%10) || (b%10 == c%10)||(c%10 == a%10)){
			return true;
		}
		return false;
			
	}
}

