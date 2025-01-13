public class NullPointerExceptionDemo {
    // Method to generate NullPointerException
    public static void generateexception() {
        String text = null; // Initialize the variable to null
        // This will throw NullPointerException
        System.out.println("Length of the text: " + text.length());
    }
    // Method to handle NullPointerException
    public static void handleexception() {
        String text = null; // Initialize the variable to null
        try {
            System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Call the method to generate NullPointerException
        try {
            generateexception();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main method: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleexception();
    }
}