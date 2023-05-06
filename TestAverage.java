import java.util.Scanner;

public class TestAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        System.out.print("Please enter the number of test scores per student: ");
        int numOfScores = input.nextInt();

        for (int i = 1; i <= numOfStudents; i++) {
            double sum = 0;
            System.out.println("Enter test scores for student " + i + ":");
            for (int j = 1; j <= numOfScores; j++) {
                System.out.print("Test score " + j + ": ");
                double score = input.nextDouble();
                sum += score;
            }
            double average = sum / numOfScores;
            System.out.println("The average test score for student " + i + " is: " + average);
        }
    }
}