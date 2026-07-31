import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        
       for(; n != 0; n = n / 10){
           int digit = n % 10;
           reverse = reverse * 10 + digit;

}
        
        System.out.println(reverse);
    }
}
