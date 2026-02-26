import java.util.Scanner;

class Solution {

    public static int GetBMICategory(int weight, float height) {
        
        // Calculate BMI
        float bmi = weight / (height * height);

        // Check BMI category
        if (bmi < 18) {
            return 0;
        } 
        else if (bmi >= 18 && bmi < 25) {
            return 1;
        } 
        else if (bmi >= 25 && bmi < 30) {
            return 2;
        } 
        else if (bmi >= 30 && bmi < 40) {
            return 3;
        } 
        else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();
        float height = sc.nextFloat();

        System.out.println(GetBMICategory(weight, height));
        
        sc.close();
    }
}