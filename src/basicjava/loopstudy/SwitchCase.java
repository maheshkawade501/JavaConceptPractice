package basicjava.loopstudy;

public class SwitchCase {
    public static void main(String[] args) {
        //Execute only one statement outof multiple condition based on input

        String day="Wednesday";
        switch (day){
            case "Monday":
                System.out.println("Monday is office Day");
                break;

            case "Tuesday":
                System.out.println("Tuesday is Heavy Load Day");
                break;

            case "Wednesday":
                System.out.println("Wednesday is Deep work day");
                break;
            case "Thursday":
                System.out.println("Thursday is Windup Day");
                break;

            case"Friday":
                System.out.println("Fun day for HR");
                break;
            case"Saturday":
                System.out.println("Study Day");
                break;
            case"Sunday":
                System.out.println("rest Day");

            default:
                System.out.println("Please correct the day");
                break;
        }

    }
}
