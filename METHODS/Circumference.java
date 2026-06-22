import java.util.Scanner;

public class Circumference {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float a = in.nextFloat();
        System.out.print("The circumference of the circle is "+ circum(a));
    }
    static float circum(float  a){
        float ans = (float)(2*Math.PI*a);
        return ans;
    }
}
