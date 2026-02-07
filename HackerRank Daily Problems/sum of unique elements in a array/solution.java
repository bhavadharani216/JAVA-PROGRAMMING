import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // size of array
        int[] arr = new int[n];

        // read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // check each element
        for (int i = 0; i < n; i++) {

            int count = 0;

            // count frequency
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // if appears only once
            if (count == 1) {
                sum += arr[i];
            }
        }

        // print result
        System.out.println(sum);
    }
}