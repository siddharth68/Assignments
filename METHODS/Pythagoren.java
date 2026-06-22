import java.util.Scanner;

public class Pythagoren {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        pythago(a,b,c);
    }
    static void pythago(float a,float b,float c){
        if(c*c==(a*a)+(b*b)){
            System.out.print("It is a pythagoren triplet");
        }
        else{
            System.out.print("It is not a pythogorean triplet");
        }
    }
}
