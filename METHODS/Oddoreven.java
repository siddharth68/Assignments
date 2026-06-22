import java.util.Scanner;

public class Oddoreven {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        oddoreven(a);
    }
    static void oddoreven (int a){
        if(a%2!=0){
            System.out.print("Odd");
        }
        else{
        System.out.print("Even");
    }}
}
