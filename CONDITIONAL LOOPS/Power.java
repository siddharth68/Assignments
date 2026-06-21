import java.util.Scanner;
public class Power {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        float a = in.nextFloat();
        System.out.print("Enter the exponent number: ");
        float b = in.nextFloat();
        double  c = Math.pow(a,b);
        System.out.print("The power of the number is "+c);

    }
}
