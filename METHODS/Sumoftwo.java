import java.util.Scanner;

public class Sumoftwo {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        System.out.print(sum(a,b));
    }
    static float sum(float a,float b){
        float sum = a+b;
        return sum;


    }
}
