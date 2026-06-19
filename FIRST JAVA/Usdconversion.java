import java.util.Scanner;
public class Usdconversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter currency in rupees: ");
        float a = in.nextFloat();
        double  b = (a * 0.011);
        System.out.println("The currency in usd is: "+ b);





    }
}
