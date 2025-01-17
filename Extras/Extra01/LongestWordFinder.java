import java.util.Scanner;
public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();

        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word in the sentence is: " + longestWord);

    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split("\\s+");
      
        String longestWord = "";

        // Iterate through the words and find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
