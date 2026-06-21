import java.util.Scanner;
public class Areaofrectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float a = in.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float b = in.nextFloat();
        double c = a*b;
        System.out.println("The area of the rectangle is "+c);

    }
}
