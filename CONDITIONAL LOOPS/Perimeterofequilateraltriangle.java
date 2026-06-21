import java.util.Scanner;
public class Perimeterofequilateraltriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the side of the triangle: ");
        float a = in.nextFloat();
        double b = 3*a;
        System.out.print("The perimeter of the equilateral triangle is "+b);

    }
}
