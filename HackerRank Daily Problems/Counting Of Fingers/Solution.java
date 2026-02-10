import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] pattern = {2,1,2,3,4,5,4,3}; // index 0 handles remainder 0

        System.out.println(pattern[n % 8]);
    }
}
