import java.util.Scanner;
public class Perimeterofsquare {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        float a = in.nextFloat();
        double b = 4*a;
        System.out.print("The perimeter of the square is "+b);
    }
}
