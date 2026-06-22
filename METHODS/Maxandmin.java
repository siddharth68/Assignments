import java.util.Scanner;

public class Maxandmin {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        max(a,b);
        min(a,b);
    }
    static void max(float a,float b){
        if(a>b){
            System.out.println("A is maximum");
        }
        else{
            System.out.println("B is maximum");
        }
    }
    static void min(float a,float b){
        if(a<b){
            System.out.println("A is minimum");
        }
        else{
            System.out.println("B is minumum");

        }
    }
}
