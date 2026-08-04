import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for (int i=1;i<num;i++){
            if(num % i == 0){
                sum=sum+i;
            }
        }
        if (sum == num){
            System.out.println("it is perfect number");
        }
        else {
            System.out.println("it is not a perfect number");
        }
  
    }    
}
