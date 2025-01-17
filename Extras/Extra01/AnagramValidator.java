import java.util.Scanner;
public class AnagramValidator {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstInput = input.nextLine();
        System.out.println("Enter the second string:");
        String secondInput = input.nextLine();
        // Check if the strings are anagrams
        boolean isAnagram = checkAnagram(firstInput, secondInput);
        if (isAnagram) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }

    // Method to check if two strings are anagrams 
    public static boolean checkAnagram(String stringOne, String stringTwo) {
        // If the lengths of the strings are different, they can't be anagrams
        if (stringOne.length() != stringTwo.length()) {
            return false;
        }
        // Convert strings to character arrays
        char[] arrayOne = stringOne.toCharArray();
        char[] arrayTwo = stringTwo.toCharArray();

        // Count the frequency of each character in both strings
             int[] frequencyCountOne = new int[256]; 
        int[] frequencyCountTwo = new int[256]; 
        // Count frequencies for the first string
        for (char character : arrayOne) {
            frequencyCountOne[character]++;
        }

        // Count frequencies for the second string
        for (char character : arrayTwo) {
            frequencyCountTwo[character]++;
        }
        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequencyCountOne[i] != frequencyCountTwo[i]) {
                return false; // If frequencies differ, strings are not anagrams
            }
        }

        return true; // Strings are anagrams if all character frequencies match
    }
}
