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
        }

        scanner.close();
    }
}
