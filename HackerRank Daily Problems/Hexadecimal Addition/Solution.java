import java.util.*;

public class Main {

    // Function to add two hexadecimal numbers as strings
    public static String addHex(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int val1 = 0;
            int val2 = 0;

            if (i >= 0) {
                val1 = hexToDecimal(a.charAt(i));
                i--;
            }

            if (j >= 0) {
                val2 = hexToDecimal(b.charAt(j));
                j--;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 16;
            int digit = sum % 16;

            result.append(decimalToHex(digit));
        }

        return result.reverse().toString();
    }

    // Convert hex character to decimal value
    public static int hexToDecimal(char c) {
        if (c >= '0' && c <= '9')
            return c - '0';
        else
            return c - 'A' + 10;
    }

    // Convert decimal (0-15) to hex character
    public static char decimalToHex(int num) {
        if (num < 10)
            return (char) (num + '0');
        else
            return (char) (num - 10 + 'A');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            System.out.println(addHex(s1.toUpperCase(), s2.toUpperCase()));
        }

        sc.close();
    }
}
