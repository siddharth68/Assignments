import java.util.Scanner;
public class Perfectnumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum =0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum=sum+i;
            }
        }
        if(sum==a){
            System.out.print("Perfect number");
        }
        else{
            System.out.print("Not a perfect number");
        }
    }
}
