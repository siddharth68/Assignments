import java.util.Scanner;
public class Perimeterofparallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the parallelogram: ");
        float a = in.nextFloat();
        System.out.print("Enter the side of the parallelogram: ");
        float b = in.nextFloat();
        double c = 2*(a+b);
        System.out.print("The perimeter of the parallelogram is "+c);

    }
}
