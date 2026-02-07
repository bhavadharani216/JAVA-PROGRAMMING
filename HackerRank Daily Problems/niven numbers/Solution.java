import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        // find sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // check Niven number
        if (n % sum == 0)
            System.out.println(n / sum);
        else
            System.out.println(0);
    }
}
