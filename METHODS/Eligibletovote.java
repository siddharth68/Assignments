import java.util.Scanner;

public class Eligibletovote {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        eligible(a);
    }
    static void eligible(int a){
        if(a>=18){
            System.out.print("Eligible to vote");
        }
        else{
            System.out.print("Not eligible to vote");
        }
    }
}
