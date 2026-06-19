import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String rev = "";
        int c = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

       for(int j=0;j<str.length();j++){
           for(int k=0;k<rev.length();k++){
               if(j==k){
                   if(str.charAt(j)==rev.charAt(k)){
                       c=c+1;
                   }
               }
           }
       }
       if(c==str.length()){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not a palindrome");
       }
    }
}