import java.util.Scanner;

public class Main {

    public static int reverse(int n) {

        int rev = 0;

        while (n != 0) {

            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;

        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int reverseNumber = reverse(n);

        int squareReverse = reverseNumber * reverseNumber;

        int squareOriginal = n * n;

        int reverseSquare = reverse(squareOriginal);

        if (squareReverse == reverseSquare)
            System.out.println("Adam Number");
        else
            System.out.println("Not Adam Number");

    }
}
