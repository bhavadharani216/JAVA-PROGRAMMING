import java.util.*;
public class calculator{
    public static void main(String[]args){
        Scanner  sc=new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1=sc.nextInt();

        System.out.println("Enter number 2");
        int num2=sc.nextInt();

        System.out.println("Addition20:"+(num1+num2));
        System.out.println("Subtraction20:"+(num1-num2));
        System.out.println("Multiplication20:"+(num1*num2));
        System.out.println("Division20:"+(num1/num2));
    }
}
