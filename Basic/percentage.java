//Write a program to calculate the percentage of 5 students.
import java.util.Scanner;

class Percentage {
    public static void main(String[] args) {
        System.out.print("Enter Marks of 5 Subjects: " );

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int totalMarks = m1 + m2 + m3 + m4 + m5;
        float totalSubjects  = 5.0f;
        float per;
        per = totalMarks/totalSubjects;
        System.out.print("Percentage of Student is : ");
        System.out.println(per);
    }
}
