//using string for reversing number 

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String rev = "";
        String str= Integer.toString(n);
        for (int i =str.length()-1; i >=0;i--){
            rev= rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
