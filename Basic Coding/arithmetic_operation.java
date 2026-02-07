import java.util.*;
public class arithmetic_operation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value for a ");
        int a=sc.nextInt();

        System.out.println("Enter value for b");
        int b=sc.nextInt();

        int c=a+b;
        System.out.println("Addition of a and b is "+c);

        System.out.println("enter value for d");
        Float d=sc.nextFloat();

        float e=c*d;
        System.out.println(e);

    }
}
