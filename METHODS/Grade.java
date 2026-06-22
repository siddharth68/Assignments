import java.util.Scanner;

public class Grade {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        grade(a);
    }
    static void grade(int a){
        if(a>90 && a<=100){
            System.out.print("AA");
        }
        else if (a>80 && a<=90) {
             System.out.print("AB");
        }
        else if (a>70 && a<=80){
            System.out.print("BB");
        }
        else if (a>60 && a<=70){
            System.out.print("BC");
        }
        else if (a>50 && a<=60){
            System.out.print("CD");
        }
        else if (a>40 && a<=50){
            System.out.print("DD");
        }
        else{
            System.out.print("Fail");
        }
    }
}
