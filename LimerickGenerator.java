import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LimerickGenerator {
    public static void main(String[] args) {
        // Arrays of words for each line
        String[] line1 = {"There was a", "Once was a", "In a land there lived a", "In bygone times lived a"};
        String[] line2 = {"man", "woman", "boy", "girl", "creature"};
        String[] line3 = {"that lived", "that jumped", "who danced", "that sang", "who dreamed"};
        String[] line4 = {"under the moon", "by the sea", "in the meadow", "in the forest", "in the city"};
        String[] line5 = {"on a dune", "by noon", "in June", "under the stars", "on Mars"};

        // Random number generator
        Random random = new Random();

        // Generate and display 10 limericks
        for (int i = 0; i < 10; i++) {
            // Shuffle each array to ensure uniqueness
            shuffleArray(line1, random);
            shuffleArray(line2, random);
            shuffleArray(line3, random);
            shuffleArray(line4, random);
            shuffleArray(line5, random);

            // Construct the limerick
            StringBuilder limerick = new StringBuilder();

            // Append first line
            limerick.append(line1[0]).append(" ");
            limerick.append(line2[0]).append(" ");

            // Append second line
            limerick.append(line3[0]).append(" ");
            limerick.append(line4[0]).append(" ");

            // Append third line
            limerick.append(line3[1]).append(" ");
            limerick.append(line4[1]).append(" ");

            // Append fourth line
            limerick.append(line5[0]).append(".");

            // Capitalize the first letter of the limerick
            limerick.replace(0, 1, String.valueOf(Character.toUpperCase(limerick.charAt(0))));

            // Output the limerick
            System.out.println(limerick);
        }
    }

    // Shuffle array method
    private static void shuffleArray(String[] array, Random random) {
        Collections.shuffle(Arrays.asList(array), random);
    }
}
