//Method 1: Without HashSet (Brute Force)

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int max = 0;
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            String temp = "";

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp += ch;

                if (temp.length() > max) {
                    max = temp.length();
                    longest = temp;
                }
            }
        }

        System.out.println("Longest Substring : " + longest);
        System.out.println("Length : " + max);
    }
}
