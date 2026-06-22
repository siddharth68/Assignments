import java.util.Scanner;

public class Productoftwo {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        System.out.print(product(a,b));
    }
    static float product(float a, float b){
        float product = a*b;
        return product;
}}
