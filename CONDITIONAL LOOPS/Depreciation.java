import java.util.Scanner;
public class Depreciation {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the asset: ");
        float a = in.nextFloat();
        System.out.print("Enter the depreciation percentage for 1 year: ");
        float b = in.nextFloat();
        System.out.print("Enter the number of years: ");
        float c = in.nextFloat();
        double d = a * ((b * c) / 100);
        double e = a-d;
        System.out.print("The value after depreciation is " + e);
    }
}