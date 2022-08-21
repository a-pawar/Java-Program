// Write a program to convert km to miles;

import java.util.Scanner;
class Convert{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.print("Enter distance in km: ");
        float km = sc.nextFloat();
        double miles = km  * 0.62137;
        System.out.println(miles);

    }
}
