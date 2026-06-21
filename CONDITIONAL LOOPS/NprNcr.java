import java.util.Scanner;
public class NprNcr{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        long factn = 1;
        long factr = 1;
        long factnr = 1;
        for (int i = 1; i <= n; i++) {
            factn = factn * i;
        }
        for(int i=1;i<=r;i++){
            factr=factr*i;
        }
        for(int i=1;i<=(n-r);i++){
            factnr=factnr*i;
        }
        long permutation = factn/factnr;
        long combination= factn/(factr*factnr);
        System.out.println(permutation);
        System.out.println(combination);


    }
}

