
import java.util.Scanner;

public class student_grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberofSubjects = sc.nextInt();

      
        int[] marks = new int[numberofSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numberofSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        double averagePercentage = (double) totalMarks / numberofSubjects;
        String grade;
        if (averagePercentage >= 90) {
            grade = "Grade A:";
            System.out.println("Excellent Performance:");
            System.out.println("Keep it Up:");

        } else if (averagePercentage >= 80) {
            grade = "Grade B:";
        } else if (averagePercentage >= 70) {
            grade = "Grade C:";
        } else if (averagePercentage >= 60) {
            grade = "Grade D:";
        } else {
            grade = "Fail";
            System.out.println("You Should to work Hard:");
        }
    
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        System.err.println("Thankyou!" + "Be Safe");
    }
}

