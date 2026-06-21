import java.util.Scanner;
public class Areaofequilateraltriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        float a = in.nextFloat();
        double b = (Math.sqrt(3)/4)*(a*a);
        System.out.print("The area of the equilateraltriangle is "+b);

    }

}
