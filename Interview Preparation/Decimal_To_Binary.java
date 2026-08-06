 
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int binary = 0;
        int place =1;
        
        while( decimal >0){
            int lastdigit = decimal % 2;
            binary = binary + lastdigit * place;
            place = place * 10;
            decimal = decimal / 2;
        }
        System.out.println(binary);
    }
}
