import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        
        int count =1;
        for(int i=0;i<s1.length();i++){
            count=1;
            while( i < s1.length()-1  && s1.charAt(i)== s1.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(s1.charAt(i) + "" + count);
        }
        
    }
}
