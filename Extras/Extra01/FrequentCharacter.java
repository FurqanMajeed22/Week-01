import java.util.Scanner;
public class FrequentCharacter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String userInput = inputScanner.nextLine();
        // Find the most frequent character using the new method
        char frequentCharacter = findFrequentChar(userInput);
        System.out.println("The character that appears most frequently is: '" + frequentCharacter + "'");

    }

    public static char findFrequentChar(String text) {
        int[] countArray = new int[256];  // Array to store frequency of characters
        int highestFrequency = 0;
        char frequentChar = text.charAt(0);
        // First pass: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            countArray[currentChar]++;
        }
        // Second pass: Identify the character with the highest frequency
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (countArray[currentChar] > highestFrequency) {
                highestFrequency = countArray[currentChar];
                frequentChar = currentChar;
            }
        }

        return frequentChar;
    }
}
