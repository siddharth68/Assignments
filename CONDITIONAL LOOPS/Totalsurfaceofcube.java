import java.util.Scanner;
public class Totalsurfaceofcube {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the cube: ");
        float a = in.nextFloat();
        double b = 6*(a*a);
        System.out.print("The total surface area of the cube is "+b);

    }
}
