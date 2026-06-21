import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        double years = sc.nextDouble();

        double futureValue = principal * Math.pow(1 + (rate / 100), years);

        System.out.println("Future Investment Value = " + futureValue);

        sc.close();
    }
}