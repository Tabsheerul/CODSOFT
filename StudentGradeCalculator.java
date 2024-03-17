import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = sc.nextInt();
        
        // Input marks obtained in each subject
        int[] marks = new int[numOfSubjects];
        int totalMarks = 0;
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        
        // Calculate total marks
        System.out.println("Total Marks: " + totalMarks);
        
        // Calculate average percentage
        double avgPercentage = (double) totalMarks / numOfSubjects;
        System.out.printf("Average Percentage: %.2f \n", avgPercentage);

        
        // Grade Calculation
        char grade;
        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else if (avgPercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        // Display Results
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
