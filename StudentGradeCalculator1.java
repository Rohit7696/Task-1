import java.util.*;

public class StudentGradeCalculator1 {
    public static void main(String[] args) {
        int total = 0;
        int numSubjects = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the subjects:");

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter the marks of subject " + i + ":");
            int marks = sc.nextInt();
            total += marks;
        }

        double percentage = (double) total / numSubjects;
        System.out.println("Percentage: " + percentage);

        if (percentage > 90) {
            System.out.println("Grade: A");
        } else if (percentage > 80 && percentage < 90) {
            System.out.println("Grade: B");
        } else if (percentage > 70 && percentage < 80) {
            System.out.println("Grade: C");
        } else if (percentage > 60 && percentage < 70) {
            System.out.println("Grade: D");
        } else if (percentage > 35 && percentage < 60) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Fail");
        }
    }
}