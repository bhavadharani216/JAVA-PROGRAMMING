//Rotate left by one position.

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String rotated = "";

        for (int i = 1; i < str.length(); i++) {
            rotated += str.charAt(i);
        }

        rotated += str.charAt(0);

        System.out.println(rotated);
    }
}
