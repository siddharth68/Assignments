import java.util.Scanner;
public class Perimeterofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float a = in.nextFloat();
        double b = 2*3.14*a;
        System.out.print("The perimeter of the circle is "+b);

    }
}
