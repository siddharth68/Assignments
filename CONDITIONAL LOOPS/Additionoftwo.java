import java.util.Scanner;
public class Additionoftwo {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number");
        float a = in.nextFloat();
        System.out.print("Enter the second number");
        float b = in.nextFloat();
        float c = a+b;
        System.out.print("The addition of two numbers is "+c);

    }

}
