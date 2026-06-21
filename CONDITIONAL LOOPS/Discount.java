import java.util.Scanner;
public class Discount {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        float a = in.nextFloat();
        System.out.print("Enter the discount percentage: ");
        float b = in.nextFloat();
        float c = a*(b/100);
        System.out.println("The discount amount is "+c);
        float d = a-c;
        System.out.println("The remaining amount is "+d);
    }
}
