import java.util.Scanner;
public class Palindrome {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int original = a;
        int rev = 0;
        while(a>0){
            int digit=a%10;
            rev= (rev*10)+digit;
            a=a/10;
        }
        if(original == rev){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}
