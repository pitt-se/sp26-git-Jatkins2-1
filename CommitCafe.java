public class CommitCafe {

    private static String barista = "Justin"; // STUDENT_TODO_1A: Change name
    private static String baristaNickname = "Mr. J"; private static String title = "[Lead Barista]"; // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println(baristaNickname + " brewed a cup of " + drink + "!");

        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". Merge conflicts taste better with espresso.");
        System.out.println("[BOT CHECK] drink length = " + drink.length()); // STUDENT_TODO_2B: Add a second brew-related improvement
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}