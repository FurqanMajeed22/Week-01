import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Input the string
        System.out.println("Enter a string");
        String input = sc.nextLine();
        // Check if the string is a palindrome
        boolean isPalindrome = Palindromecheck(input);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }

    // Method to check if a string is a palindrome
	public static boolean Palindromecheck(String input) {
int left = 0;
int right = input.length() - 1;
while (left < right) {
if (input.charAt(left) != input.charAt(right)) {
return false;
}
left++;
right--;
}
return true;
}
 
}
