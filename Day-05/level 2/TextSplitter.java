import java.util.Scanner;

public class TextSplitter {

    // Method to calculate string length without using length() method
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split text into words without using split() method
    public static String[] splitText(String text) {
        int n = findLength(text), wordCount = 0;
        int[] spaceIndexes = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[wordCount++] = i;
            }
        }
        spaceIndexes[wordCount++] = n;

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }
        return words;
    }

    // Method to compare two arrays of strings
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] customSplit = splitText(input);
        String[] builtInSplit = input.split(" ");

        boolean areEqual = compareArrays(customSplit, builtInSplit);

        System.out.println("\nCustom Split Result:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both results equal? " + areEqual);
        sc.close();
    }
}
