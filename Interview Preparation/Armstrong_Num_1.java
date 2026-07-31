import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int original = n;
        int temp=n;
        
        int digits=0;
        
        while(temp != 0){
            digits++;
            temp=temp/10;
        }
        temp=n;
        int sum=0;
        
        while (temp != 0) {

            int digit = temp % 10;

            sum += Math.pow(digit, digits);

            temp = temp / 10;
        }
         
        if (sum == original){
            System.out.println("it is armstrong");
        }else {
            System.out.println("it is not a armstrong");
        }
    }
}
