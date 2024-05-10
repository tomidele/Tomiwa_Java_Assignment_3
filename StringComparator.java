import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Input second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare strings using compareTo method
        int comparisonResult = str1.compareTo(str2);

        // Output comparison result
        if (comparisonResult < 0) {
            System.out.println("The first string is less than the second string.");
        } else if (comparisonResult > 0) {
            System.out.println("The first string is greater than the second string.");
        } else {
            System.out.println("The first string is equal to the second string.");
        }

        scanner.close();
    }
}
