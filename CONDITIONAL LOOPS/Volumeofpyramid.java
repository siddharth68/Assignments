import java.util.Scanner;
public class Volumeofpyramid {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the pyramid: ");
        float a = in.nextFloat();
        System.out.print("Enter the width of the pyramid: ");
        float b = in.nextFloat();
        System.out.print("Enter the length of the pyramid: ");
        float c = in.nextFloat();
        double d = (a*b*c)/3;
        System.out.print("The volume of the pyramid is "+d);

    }
}
