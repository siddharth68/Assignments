import java.util.Scanner;
public class Armstrong {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int ori = a;
        int digit = 0;
        int fre = 0;
        while(a>0){
            digit = a%10;
             fre = fre +(digit*digit*digit);
            a = a/10;
        }
        if(ori == fre){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not armstrong");
        }

    }
}
