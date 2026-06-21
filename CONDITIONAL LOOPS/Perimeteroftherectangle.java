import java.util.Scanner;
public class Perimeteroftherectangle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        float a = in.nextFloat();
        System.out.print("Enter the length of the rectangle: ");
        float b = in.nextFloat();
        double c = 2*(a+b);
        System.out.print("The perimeter of the rectangle is "+c);
    }
}
