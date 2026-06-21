import java.util.Scanner;
public class Sumofpnodd {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int positive = 0;
        int negative = 0;
        int odd =0;
        for(int i=0;i<a;i++){
            int b =in.nextInt();
            if(b >0){
                positive=positive+ b;
            } if (b <0) {
                negative=negative+ b;
            }
            if(b %2!=0){
                odd=odd+ b;
            }

        }
        System.out.print("Sum of positive numbers "+positive);
        System.out.print("Sum of negative numbers "+negative);
        System.out.print("Sum of odd numbers "+odd);
    }
}
