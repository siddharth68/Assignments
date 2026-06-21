import java.util.Scanner;
public class Areaofisosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        float a = in.nextFloat();
        System.out.print("Enter the second side: ");
        float b= in.nextFloat();
        double c= b/4* Math.sqrt((4*a*a)-(b*b));
        System.out.println("The area of the isosceles triangle is "+c);


    }
}
