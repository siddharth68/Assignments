import java.util.Scanner;
public class Greetingmessage {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String a= in.nextLine();
        System.out.println("Welcome to java programming Mr "+a);

    }
}
