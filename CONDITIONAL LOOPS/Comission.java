import java.util.Scanner;
public class Comission {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        float a = in.nextFloat();
        System.out.print("Enter the commission percentage: ");
        float b = in.nextFloat();
        float c = a*(b/100);
        System.out.println("The commission  amount is "+c);

    }
}
