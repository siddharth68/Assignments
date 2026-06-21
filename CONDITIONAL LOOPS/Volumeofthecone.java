import java.util.Scanner;
public class Volumeofthecone{
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the cone: ");
        float a = in.nextFloat();
        System.out.print("Enter the radius of the cone: ");
        float b = in.nextFloat();
        double c = (0.33333)*(3.14)*(b*b)*a;
        System.out.print("The volume of the cone is "+c);



    }

}