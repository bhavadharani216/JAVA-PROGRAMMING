import java.util.*;

public class Main {

    // Function to check if two strings are anagrams
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i])
                continue;

            System.out.print(arr[i] + " ");
            visited[i] = true;

            for (int j = i + 1; j < n; j++) {
                if (!visited[j] && isAnagram(arr[i], arr[j])) {
                    System.out.print(arr[j] + " ");
                    visited[j] = true;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}