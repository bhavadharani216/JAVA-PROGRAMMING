// replace character in a string 

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
        
        
        if (ch == 'a'){
            System.out.print("?");
        }
        else {
                System.out.print(ch);
            }
        }
         
    }    
}
