import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ori = num;
        int sum =0;
        
        while( num != 0){
            int digits = num % 10;
            
            int fact =1;
            for (int i=1;i<=digits;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
            
        }
        if (sum == ori){
            System.out.println("it is strong number");
        }
        else {
            System.out.println("it is not a strong number");
        }
  
    }    
}
