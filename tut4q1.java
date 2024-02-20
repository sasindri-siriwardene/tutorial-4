import java.util.Scanner;

public class tut4q1 {
    public static void main(String[] args) {
        int[] values = new int[6];
        int failed = 0;
        int total = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter " + (i + 1) + " marks: ");
            int marks = input.nextInt();
            if (marks < 40) {
                failed++;
            }
            values[i] = marks;
            total += marks;
        }

        average = (double) total / values.length; // Calculate the average after all marks have been entered

        System.out.println("Number of failed students: " + failed);
        System.out.println("Student average total: " + total);
        System.out.println("Student average score: " + average);
    }
}
