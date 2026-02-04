import java.util.*;

public class WeekMood {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day of week:");
        String day = sc.next().toLowerCase();

        switch(day) {

            case "mon":
            case "tue":
                System.out.println("Irritating");
                break;

            case "wed":
            case "thu":
                System.out.println("Frustrated");
                break;

            case "fri":
                System.out.println("Expectations");
                break;

            case "sat":
            case "sun":
                System.out.println("Holidays");
                break;

            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}
