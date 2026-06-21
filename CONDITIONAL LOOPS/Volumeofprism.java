import java.util.Scanner;
public class Volumeofprism {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // program to find rectangular prism
        System.out.print("Enter the length of the rectangular prism: ");
        float a = in.nextFloat();
        System.out.print("Enter the width of the rectangular prism: ");
        float b = in.nextFloat();
        System.out.print("Enter the height of the rectangulr prism: ");
        float c = in.nextFloat();
        double d = a*b*c;
        System.out.println("The volume of the rectangular prism is "+d);
        System.out.print("Enter the base of the triangle: ");
        float e = in.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float f = in.nextFloat();
        System.out.print("Enter the length of the tringular prism: ");
        float g = in.nextFloat();
        double h = 0.5*e*f*g;
        System.out.print("The volume of the triangular prism is "+h);

        }
        //program to find triangular prism



    }


