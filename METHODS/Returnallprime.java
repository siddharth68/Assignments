import java.util.Scanner;

public class Returnallprime {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        returnprime(a,b);
    }
    static void returnprime(int a,int b){
        for(int i=a;i<=b;i++){
            if(i<=1){
                continue;
            }
            boolean isPrime=true;
            int c=2;
            while(c<=Math.sqrt(i)){
                if(i%c==0){
                    isPrime=false;
                }
                c=c+1;
            }
            if(isPrime) {
                System.out.print(i + " ");
            }

        }
    }
}
