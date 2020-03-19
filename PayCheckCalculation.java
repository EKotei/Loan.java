import java.util.Scanner;

public class PayCheckCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your salary?");
        int s = scan.nextInt();

        System.out.println("How many hours did you work?");
        int h = scan.nextInt();

        int pc = s*h;
        boolean ot = (h>40);
        float t = 1.5f;
        if(ot) {
            System.out.println(pc * t);

        } else
            System.out.println(pc);











    }




}
