import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Cyclic swap: a -> b, b -> c, c -> a
        a = a + b + c;
        b = a - (b + c);   // Original a
        c = a - (b + c);   // Original b
        a = a - (b + c);   // Original c

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
