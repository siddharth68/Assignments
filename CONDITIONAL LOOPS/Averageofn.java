import java.util.Scanner;
public class Averageofn {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float original = a;
        float b = 0;
        for(int i=0;i<a;i++){
            float num  = in.nextFloat();
            b=b+num;
        }
        float c = b/original;
        System.out.print("The average of numbers are "+c);
    }

}
