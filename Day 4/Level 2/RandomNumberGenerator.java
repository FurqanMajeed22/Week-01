public class RandomNumberGenerator {

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
		for(int i=0;i<randomNumbers.length;i++){
		  System.out.print(randomNumbers[i] +" ");
		}
		System.out.println();
        
        // Find the average, minimum, and maximum values
        double[] result = findAverageMinMax(randomNumbers);
		
        
        // Print the results
        System.out.println("Average " + result[0]);
        System.out.println("Minimum Value " + result[1]);
        System.out.println("Maximum Value" + result[2]);
    }

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        
        return numbers;
    }

    // Method to find the average, minimum, and maximum value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;
        
        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        // Calculate the average
        double average = sum / numbers.length;
        
        // Return the average, min, and max in an array
        return new double[]{average, min, max};
    }
}
