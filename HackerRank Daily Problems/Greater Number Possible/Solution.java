import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read full line of numbers
        String input = sc.nextLine();

        // Remove spaces (combine all digits)
        input = input.replace(" ", "");

        // Convert to char array (digits)
        char[] digits = input.toCharArray();

        // Sort digits
        Arrays.sort(digits);

        // Print in reverse order (descending)
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
