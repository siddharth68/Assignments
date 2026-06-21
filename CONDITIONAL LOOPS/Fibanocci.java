import java.util.Scanner;
public class Fibanocci {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //program to find the particuar fibanocci element
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
       //program to find the entire fibanocci sereis
       int x = in.nextInt();
       int y = 0;
       int z = 1;
       int c = 2;
       System.out.print(y+" "+z);
       while(c<=x){
           int temp = z;
           z=y+z;
           System.out.print(" "+z);
           y=temp;
           c=c+1;
       }
    }
}


