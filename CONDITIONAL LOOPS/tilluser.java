import java.util.Scanner;
public class tilluser {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a;
        float sum =0;
        while(true){
             a = in.nextFloat();
            if(a==0){
                break;
            }
            sum=sum+a;
        }
        System.out.print(sum);
    }
}
