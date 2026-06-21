import java.util.Scanner;
public class Areaofparallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the parallelogram: ");
        float a = in.nextFloat();
        System.out.print("Enter the width of the parallelogram: ");
        float b = in.nextFloat();
        double c = a*b;
        System.out.println("The area of the parallelogram  is "+c);

    }
}
