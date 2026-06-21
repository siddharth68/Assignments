import java.util.Scanner;
public class Volumeofcylinder {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the cylinder: ");
        float a = in.nextFloat();
        System.out.print("Enter the radius of the cylinder: ");
        float b = in.nextFloat();
        double c = 3.14*(b*b)*a;
        System.out.print("The volume of the cylinder is "+c);
    }
}
