import java.util.Scanner;
public class evendays {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the day kunal wants to go out: ");
        int a = in.nextInt();
        if(a>0 && a<=31){
            if(a%2==0){
                System.out.print("Kunal is allowed to go out");
            }
            else{
                System.out.print("Kunal is not allowed to go out");
            }

        }
    }
}
