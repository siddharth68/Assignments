import java.util.Scanner;
public class Distancebtwopoints {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d = in.nextFloat();
        double e = Math.sqrt(((c-a)*(c-a))+((d-b)*(d-b)));
        System.out.print(e);


        }
    }

