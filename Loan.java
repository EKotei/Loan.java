import java.math.MathContext;
import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your salary?");
        int x = scan.nextInt();

        System.out.println("How long have you been employed here?");
        int y = scan.nextInt();


          long lq = 80000;
        boolean good = (lq>=80000);
        boolean bad = (lq<80000);
        if ( good)
        System.out.println("Yaaay..you qualify");

    else {
            System.out.println("To make salary you need" + bad);


        }

    }

}
