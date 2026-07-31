//Method 1: Using for Loop


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int count = 0;
        if(n<=1){
            System.out.println("not prime");
            return;
        }
        for(int i=1;i<=n;i++){
            if(n% i==0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("It is prime number ");
        }
        else {
            System.out.println("It  is not prime number");
        }
    }
}
