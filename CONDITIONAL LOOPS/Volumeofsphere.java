import java.util.Scanner;
public class Volumeofsphere {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        float a = in.nextFloat();
        double b = (4.0/3.0 )*Math.PI*(a*a*a);
        System.out.print("The volume of the sphere is "+b);
    }
    }

