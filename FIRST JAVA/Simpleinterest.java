import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        System.out.print("Enter principal amount: ");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        System.out.print("Enter Annual rate of interest: ");
        float b = in.nextFloat();
        System.out.print("Enter time duration in years: ");
        float c = in.nextFloat();
        float d = (a*b*c)/100;
        System.out.print("The simple interest is: "+d);


    }

}
