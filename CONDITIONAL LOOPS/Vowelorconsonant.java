import java.util.Scanner;
public class Vowelorconsonant {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                System.out.print("Vowel");
            }
            else{
                System.out.print("Consonant");
            }
        }
        if (a >= 'A' && a <= 'Z') {
            if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
                System.out.print("Vowel");
            }
            else{
                System.out.print("Consonant");
            }
        }
    }
}


