import java.util.Scanner;
public class Leapyear {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%4==0 && a%400==0){
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not a leap year");
        }
    }
}
