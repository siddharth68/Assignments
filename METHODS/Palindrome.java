import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int original = a;
        if(palindrome(a)==original){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
    static int  palindrome(int a) {
        int rem=0;
        while(a>0){
        int digit = a % 10;
        rem = (rem * 10) + digit;
        a = a / 10;
    }
        return rem;
    }


}
