// Left Rotate by k Positions

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int k = sc.nextInt();

        int n = str.length();
        k = k % n;

        String result = "";

        // Add characters from k to end
        for (int i = k; i < n; i++) {
            result += str.charAt(i);
        }

        // Add characters from beginning to k-1
        for (int i = 0; i < k; i++) {
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}
