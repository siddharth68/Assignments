import java.util.Scanner;
public class HcfandLcmoftwo {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a*b;
        while(b!=0){
            int temp = b;
            b= a%b;
            a = temp;
        }
        System.out.print("HCF of two numbers are "+a);
        int lcm = c/a;
        System.out.print("LCM of two numbers are "+lcm);
    }
}
