import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // Respond to user
        System.out.println("Nice to meet you, " + name + "!");
        
        scanner.close();
    }
}
