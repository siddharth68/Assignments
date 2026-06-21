import java.util.Scanner;
public class Stringrev {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String rev ="";
        for(int i = word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        System.out.print("The reversed string is "+rev);

    }
}
