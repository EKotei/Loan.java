import java.util.Scanner;

public class SpareChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pennies you want foo?!");
        int p = scan.nextInt();

        System.out.println("Aye how many nickels you need foo??");
        int n = scan.nextInt();

        System.out.println("How many dimes would you like my good sir?");
        int d = scan.nextInt();

        System.out.println("How many quarters we talkin... foo?!");
        int q = scan.nextInt();
int a = 100;
int u = p + n + d + q;
int dif = a-u;
        boolean onTheMoney = (u == a);
        boolean noBueno = (u < dif);
        if(onTheMoney){
            System.out.println("You win!!!");

        } else
            System.out.println("you were under" + noBueno);












    }


}
