//Method 1: Using Reverse Number

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ori = n;

        int rev = 0;
        
        while( n !=0){
            int digit = n % 10;
            rev = rev * 10 +digit;
            n=n/10;
        }
        if ( ori == rev){
            System.out.println("it is palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }
}
