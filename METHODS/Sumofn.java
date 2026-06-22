import java.util.Scanner;

public class Sumofn {
    static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        sumofn(a);
    }
    static void sumofn(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=sum+i;
        }
        System.out.print(sum);
    }
}
