import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double gradePoint = sc.nextDouble();

            System.out.print("Enter credits for subject " + i + ": ");
            int credits = sc.nextInt();

            totalPoints = totalPoints + (gradePoint * credits);
            totalCredits = totalCredits + credits;
        }

        double cgpa = totalPoints / totalCredits;

        System.out.println("CGPA = " + cgpa);

        sc.close();
    }
}