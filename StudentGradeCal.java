import java.util.Scanner;

public class StudentGradeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // This values will never change
        final int Total_SUB = 5;
        final int MAX_MARKS = 100;

        // Input marks obtained in each subject
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        int totalMarks = 0;
        for (int i = 1; i <= Total_SUB; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();

            // Marks should be betwwen 0 and 100
            if (marks < 0 || marks > MAX_MARKS) {
                System.out.println("Please, Enter the marks in between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        // Calculate total marks
        double avgPercentage = (double) totalMarks / Total_SUB;

        // Grade calculation
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

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", avgPercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
