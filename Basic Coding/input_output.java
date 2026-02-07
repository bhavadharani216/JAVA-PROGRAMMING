import java.util.*;

public class input_output {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your name");
        String name=sc.nextLine();
        

        System.out.println("Enter your age");
        int age=sc.nextInt();
        

        System.out.println("Enter your Roll number");
        int rollno =sc.nextInt();

        System.out.println("Your Name is:"+name);
        System.out.println("Your Age is:"+age);
        System.out.println("Your Roll number is:"+rollno);
    }
}
