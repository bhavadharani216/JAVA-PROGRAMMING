import java.util.*;
public class area_of_circle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter value of radius");
        float radius =sc.nextFloat();
        System.out.println("enter value for pi");
        float pi=sc.nextFloat();

        float area=pi*radius*radius;
        System.out.printf("Area of circle is: %.2f", area);
    
    }
    
}
