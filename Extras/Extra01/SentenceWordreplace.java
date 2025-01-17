import java.util.Scanner;
public class SentenceWordreplace {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String originalSentence = input.nextLine();
        System.out.println("Enter the word to replace:");
        String targetWord = input.nextLine();
        System.out.println("Enter the new word:");
        String replacementWord = input.nextLine();
        // Replace the word in the sentence
        String updatedSentence = replaceWordInSentence(originalSentence, targetWord, replacementWord);
        // Output the updated sentence
        System.out.println("Updated Sentence: " + updatedSentence);
    }

    // Method to replace a given word with another word in a sentence
    public static String replaceWordInSentence(String sentence, String oldWord, String newWord) {
        // Split the sentence into words
        String[] wordArray = sentence.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();
        // Loop through each word in the array
        for (String word : wordArray) {
            // If the current word matches the old word, replace it with the new word
            if (word.equals(oldWord)) {
                modifiedSentence.append(newWord);
            } else {
                modifiedSentence.append(word);
            }
            modifiedSentence.append(" "); // Add space after each word
        }
        // Return the modified sentence without the trailing space
        return modifiedSentence.toString().trim();
    }
}
