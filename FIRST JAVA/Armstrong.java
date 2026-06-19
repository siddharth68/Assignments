import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         int fresh  = num;
         int sum=0;
         while(num>0){
             int digit  = num%10;
             sum  =sum+(digit*digit*digit);
             num=num/10;


         }
         if( sum  ==fresh){
             System.out.println("Armstrong");
         }
         else{
             System.out.println("Not Armstrong");
         }

    }
}
