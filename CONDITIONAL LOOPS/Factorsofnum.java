import java.util.Scanner;
public class Factorsofnum {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int i;
        for (i=1; i<=a; i++){
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
