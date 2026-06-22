import java.util.Scanner;

public class Primeornot {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        prime(a);

    }
    static void prime(int a){
        if(a<=1){
            System.out.print("Neither prime nor composite");
            return;
        }
        int c =2;
        while(c<=Math.sqrt(a)){
            if(a%c==0){
                System.out.print("Composite");
                return;
            }
            c=c+1;
        }

            System.out.print("Prime");
    }
}
