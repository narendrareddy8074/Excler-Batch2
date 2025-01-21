public class PalindromeChecker {

    public static void main(String[] args) {
        // Test the isPalindrome method
        System.out.println(isPalindrome(232)); // Output: 1
        System.out.println(isPalindrome(345)); // Output: 0
        System.out.println(isPalindrome(-121)); // Output: -1
        System.out.println(isPalindrome(0)); // Output: -1
    }

    // Method to check if the number is palindrome
    public static int isPalindrome(int x) {
        // If the number is negative or zero, return -1
        if (x <= 0) {
            return -1;
        }

        // Store the original number to compare later
        int original = x;
        int reversed = 0;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            x = x / 10; // Remove the last digit
        }

        // Check if the reversed number is equal to the original number
        if (original == reversed) {
            return 1; // It's a palindrome
        } else {
            return 0; // It's not a palindrome
        }
    }
}
