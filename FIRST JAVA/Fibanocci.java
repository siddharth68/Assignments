import java.util.Scanner;
public class Fibanocci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;
        int c = 1;
        System.out.print(b+" "+c);
        for(int i=2;i<a;i++){
            int d = b+c;
            System.out.print(" "+d);
            b = c;
            c = d;




        }

    }
}
