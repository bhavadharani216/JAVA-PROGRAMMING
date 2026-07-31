// reverse a number in array , 
// get arr size
// get input to a array
// using two pointer 
//using temp variable


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse array
        int start = 0;
        int end = n - 1;

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
