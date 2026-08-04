import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("before swapping the value of n "+n);
        System.out.println("before swapping the value of m "+ m);
        
        int temp = n;
        n = m;
        m=temp;
        System.out.println("after swapping the value of n " +n);
        System.out.println("after swapping the value of m "+ m);
    }
}
