//Write a program to Whether the number entered by the user is int or not.
        
import java.util.Scanner;
class Check {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
        boolean bool= sc.hasNextInt();
        System.out.println(bool);
    }
}
