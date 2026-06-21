import java.util.Scanner;
public class Areaofrhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first diagonal: ");
        float a = in.nextFloat();
        System.out.print("Enter the second diagonal: ");
        float b = in.nextFloat();
        double c = a*b/2;
        System.out.println("The area of the rhombus is "+c);


    }
}
