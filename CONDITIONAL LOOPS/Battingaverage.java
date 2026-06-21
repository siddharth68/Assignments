import java.util.Scanner;
public class Battingaverage {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total runs scored: ");
        int a = in.nextInt();
        System.out.print("Enter the no of times out: ");
        int b = in.nextInt();
        int c = a/b;
        System.out.print("The batting average of the person is "+c);
    }
}
