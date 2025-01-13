import java.util.Scanner;
public class FriendsDetails {
    public static void main(String[] args) {
        // Scanner to read input
        Scanner input = new Scanner(System.in);
        // Array to store names
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i]);
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + friends[i] +);
            heights[i] = input.nextInt();
        }

        // Find youngest and tallest
        String youngest = findYoungestFriend(friends, ages);
        String tallest = findTallestFriend(friends, heights);

        // Display results
        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
    }

    // Method to find the youngest friend
    public static String findYoungestFriend(String[] names, int[] ages) {
        int minAge = ages[0];
        int indexOfYoungest = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                indexOfYoungest = i;
            }
        }

        return names[indexOfYoungest];
    }

    // Method to find the tallest friend
    public static String findTallestFriend(String[] names, int[] heights) {
        int maxHeight = heights[0];
        int indexOfTallest = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                indexOfTallest = i;
            }
        }
        return names[indexOfTallest];
    }
}
