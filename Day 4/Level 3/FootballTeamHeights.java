import java.util.Random;
public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] playerHeights = generatePlayerHeights(11, 150, 250); // Generate random heights
        printPlayerHeights(playerHeights); // Display heights
        int totalHeight = calculateTotalHeight(playerHeights);
        double averageHeight = calculateAverageHeight(playerHeights, totalHeight);
        int shortestHeight = findMinimumHeight(playerHeights);
        int tallestHeight = findMaximumHeight(playerHeights);
        System.out.println("Total Height: " + totalHeight + " cm");
        System.out.println("Average Height: " + String.format("%.2f", averageHeight) + " cm");
        System.out.println("Shortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height: " + tallestHeight + " cm");
               }

    // Generates an array of random heights within a specified range
    public static int[] generatePlayerHeights(int numberOfPlayers, int minHeight, int maxHeight) {
        Random random = new Random();
        int[] heights = new int[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            heights[i] = random.nextInt(maxHeight - minHeight + 1) + minHeight;
        }
        return heights;
    }

    // Prints the array of player heights
    public static void printPlayerHeights(int[] heights) {
        System.out.print("Player Heights (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
    }

    // Calculates the total height of players
    public static int calculateTotalHeight(int[] heights) {
        int total = 0;
        for (int height : heights) {
            total += height;
        }
        return total;
    }

    // Calculates the average height of players
    public static double calculateAverageHeight(int[] heights, int totalHeight) {
        return (double) totalHeight / heights.length;
    }

    // Finds the shortest height among players
    public static int findMinimumHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Finds the tallest height among players
    public static int findMaximumHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
