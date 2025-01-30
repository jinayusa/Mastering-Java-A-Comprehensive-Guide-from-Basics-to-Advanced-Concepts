//Explore how conditionals guide program flow.
public class LogicBuilding {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        String day = "Friday";
        switch (day) {
            case "Monday": System.out.println("Start the week strong!"); break;
            case "Friday": System.out.println("TGIF!"); break;
            default: System.out.println("Enjoy the day!");
        }
    }
}
