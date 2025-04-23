import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greeting
        System.out.print("👋 What's your name? ");
        String name = scanner.nextLine().trim();

        System.out.print("📅 How old are you, " + name + "? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        int birthYear = java.time.LocalDate.now().getYear() - age;
        System.out.println("🎉 You were probably born in " + birthYear + "!");

        // Menu loop
        boolean running = true;
        while (running) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Greet me again");
            System.out.println("2. Tell me a random fun fact");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.println("👋 Hello again, " + name + "!");
                    break;
                case 2:
                    System.out.println("🧠 Fun Fact: Honey never spoils. Archaeologists have found 3,000-year-old jars of honey that are still edible!");
                    break;
                case 3:
                    System.out.println("👋 Goodbye, " + name + "! Have a great day!");
                    running = false;
                    break;
                default:
                    System.out.println("❗ Invalid choice. Please try again.");
        }
        }
        

        scanner.close();
    }
}
