import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        System.out.print("Enter Number of Times Interest is Compounded per Year: ");
        int n = sc.nextInt();

        double amount = principal * Math.pow(1 + (rate / (100 * n)), n * time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest = " + compoundInterest);
        System.out.println("Final Amount = " + amount);


    }
}