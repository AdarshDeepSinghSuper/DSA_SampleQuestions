public class wordRev2 {
    public static void reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+"); // Split by whitespace

        // Create a StringBuilder to store the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();

        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        // Convert StringBuilder to String and trim any extra whitespace
        String reversed = reversedSentence.toString().trim();

        // Print the reversed sentence
        System.out.println("Reversed Sentence: " + reversed);
    }

    public static void main(String[] args) {
        String sentence = "I am going to Delhi";
        reverseWords(sentence);
    }
}
