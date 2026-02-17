import java.util.Scanner;

public class Main {

    // function to calculate points of one card
    static int getPoints(int card) {
        if (card == 11) return 3;   // Jack
        if (card == 9)  return 2;
        if (card == 1 || card == 10) return 1; // Ace or 10
        return 0;
    }

    // function given in question
    static int GetTotalPoints(int a, int b, int c, int d) {
        return getPoints(a) + getPoints(b) + getPoints(c) + getPoints(d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int result = GetTotalPoints(a, b, c, d);
        System.out.println(result);

        sc.close();
    }
}