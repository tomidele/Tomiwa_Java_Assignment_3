import java.util.Random;

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        // Arrays of words
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        // Random number generator
        Random random = new Random();

        // Generate and display 20 sentences
        for (int i = 0; i < 20; i++) {
            // Construct the sentence
            StringBuilder sentence = new StringBuilder();

            // Capitalize the first word of the sentence
            sentence.append(articles[random.nextInt(articles.length)]).replace(0, 1, String.valueOf(Character.toUpperCase(sentence.charAt(0))));

            // Append the rest of the words
            sentence.append(" ").append(nouns[random.nextInt(nouns.length)]);
            sentence.append(" ").append(verbs[random.nextInt(verbs.length)]);
            sentence.append(" ").append(prepositions[random.nextInt(prepositions.length)]);
            sentence.append(" ").append(articles[random.nextInt(articles.length)]);
            sentence.append(" ").append(nouns[random.nextInt(nouns.length)]).append(".");

            // Output the sentence
            System.out.println(sentence);
        }
    }
}
