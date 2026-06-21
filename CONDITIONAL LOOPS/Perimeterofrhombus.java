import java.util.Scanner;
public class Perimeterofrhombus {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diagonal length of the rhombus: ");
        float a = in.nextFloat();
        double b = 4*a;
        System.out.print("The perimeter of the rhombus is "+b);

    }
}
