import java.util.Scanner;
public class Electricity {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the units of electricity used: ");
        float a = in.nextFloat();
        System.out.print("Enter the amount per unit electricity: ");
        float b = in.nextFloat();
        float c = a*b;
        System.out.print("The amount for the electricity is "+c);
    }
}
