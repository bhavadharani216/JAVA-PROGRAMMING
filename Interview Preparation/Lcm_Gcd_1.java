import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {

            int temp = y;
            y = x % y;
            x = temp;

        }

        int gcd = x;

        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
