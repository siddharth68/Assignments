import java.util.Scanner;

public class Averageofmark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            sum = sum + sc.nextDouble();
        }

        double average = sum / n;

        System.out.println("Average Marks = " + average);


    }
}