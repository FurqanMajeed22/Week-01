import java.util.Scanner;
public class SubstringOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the main string
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();
        // Input the substring to be searched
        System.out.println("Enter the substring to count:");
        String substring = scanner.nextLine();

        // Count occurrences of the substring in the main string
        int count = countSubstringOccurrences(mainString, substring);

        // Output the result
        System.out.println("The substring '" + substring + "' occurs " + count + " times in the main string.");

        scanner.close();
    }

    // Method to count how many times a substring occurs in the main string
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0; 
        // Loop through the main string to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move index forward by the length of the substring
        }

        return count;
    }
}
