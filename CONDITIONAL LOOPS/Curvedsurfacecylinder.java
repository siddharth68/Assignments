import java.util.Scanner;
public class Curvedsurfacecylinder {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the cylinder: ");
        float a = in.nextFloat();
        System.out.print("Enter the height of the cylinder: ");
        float b = in.nextFloat();
        double c = 2*Math.PI*a*b;
        System.out.print("The curved surface area of the cylinder is "+c);

    }
    }

