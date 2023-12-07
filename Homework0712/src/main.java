import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write 1st num = ");
        double m = sc.nextDouble();
        System.out.println("Write 2d num = ");
        double n = sc.nextDouble();

        if (Math.abs(10 - m) > Math.abs(10 - n)) {
            System.out.println("Num " + m + "nearere to 10");
        } else if (Math.abs(10 - n) > (10 - m)) {
            System.out.println("Num " + m);
        } else {

            System.out.println("Nums same distance from 10");
        }
    }
}