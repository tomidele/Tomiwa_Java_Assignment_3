import java.util.Scanner;

public class ReverseTokenize {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input line of text
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();

        // Tokenize line using split method
        String[] tokens = inputLine.split("\\s+");

        // Output tokens in reverse order
        System.out.println("Tokens in reverse order:");
        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.println(tokens[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
