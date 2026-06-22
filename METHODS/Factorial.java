import java.util.Scanner;

public class Factorial {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ans = factorial(a);
        System.out.print(ans);
    }
    static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
}
