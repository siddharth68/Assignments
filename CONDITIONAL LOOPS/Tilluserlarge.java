import java.util.Scanner;
public class Tilluserlarge {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int l = a;
        while(a!=0){
            if(a>l){
                l=a;
            }
            a=in.nextInt();
        }
        System.out.print("The largest number is "+l);

    }
}
