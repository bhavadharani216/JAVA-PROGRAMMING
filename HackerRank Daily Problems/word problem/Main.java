import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lenStr = sc.nextInt();   // length of string (not needed for logic)
        sc.nextLine();              // consume newline

        String str = sc.nextLine(); // full sentence

        int lenWord = sc.nextInt(); // length of word (not needed)
        sc.nextLine();              // consume newline

        String word = sc.nextLine(); // word to search

        int count = 0;

        // split sentence into words
        String[] arr = str.split(" ");

        // count occurrences
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
