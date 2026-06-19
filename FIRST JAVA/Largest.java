import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        if (a>b){
            System.out.println("A is the greatest number");
        }
        else if(b>a){
            System.out.println("B is the greatest number");
        }
        else{
            System.out.println("Both the numbers are equal");
        }

    }
}
