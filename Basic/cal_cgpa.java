 // Write a program to calculate the CGPA of 3 subjects.
import java.util.Scanner;
class cal_cgpa {
    public static void main(String[] args) {
	        System.out.print("Enter Marks of 3 subjects : ");
	        Scanner sc = new Scanner(System.in);
	        int m1 = sc.nextInt();
           int m2 = sc.nextInt();
           int m3 = sc.nextInt();

          int totalMarks = m1 + m2 +m3;
          float per =totalMarks/3;
          float CGPA = per/10;
          System.out.println("CGPA: " + CGPA);
     }
}
