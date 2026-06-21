import java.util.Scanner;
public class Sumofdigits {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        while(a>0){
            int digits=a%10;
            sum=sum+digits;
            a=a/10;

        }
        System.out.print(sum);
    }
}
