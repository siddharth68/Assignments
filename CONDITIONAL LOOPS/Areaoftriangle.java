import java.util.Arrays;
import java.util.Scanner;
public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        float a= in.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float b = in.nextFloat();
        double c = (a*b)/2;
        System.out.print("The area of the triangle is "+c);

    }
}
