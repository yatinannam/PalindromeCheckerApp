import java.util.Stack;

public class PalindromeCheckerApp {

    // Application constants
    private static final String APP_NAME = "Palindrome Checker Management System";
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC1: Application Entry & Welcome Message
        displayWelcomeMessage();

        // UC2: Print a Hardcoded Palindrome Result
        checkHardcodedPalindrome();

        // UC3: Palindrome Check Using String Reverse
        checkPalindromeUsingReverse();

        // UC4: Character Array Based Palindrome Check
        checkPalindromeUsingCharArray();

        // UC5: Stack-Based Palindrome Checker
        checkPalindromeUsingStack();

        // Program continues to next use case or exits
        System.out.println("System initialized successfully.");
    }

    // UC1: Displays the welcome message with application name and version
    private static void displayWelcomeMessage() {
        System.out.println("Welcome to the " + APP_NAME);
        System.out.println("Version : " + APP_VERSION);
    }

    // UC2: Check and display result for a hardcoded palindrome string
    private static void checkHardcodedPalindrome() {
        String input = "madam";
        boolean result = isPalindrome(input);
        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome? : " + result);
    }

    // Checks if a given string is a palindrome
    private static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // UC3: Check palindrome by reversing the string
    private static void checkPalindromeUsingReverse() {
        String input = "madam";
        boolean result = isPalindromeByReverse(input);
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reverseString(input));
        System.out.println("Is it a palindrome? : " + result);
    }

    // Reverses a string using a loop
    private static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return reversed;
    }

    // Checks if a string is a palindrome by comparing with its reverse
    private static boolean isPalindromeByReverse(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // UC4: Check palindrome using character array and two-pointer technique
    private static void checkPalindromeUsingCharArray() {
        String input = "radar";
        boolean result = isPalindromeUsingCharArray(input);
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    // Checks if a string is a palindrome using char array and two-pointer approach
    private static boolean isPalindromeUsingCharArray(String input) {
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        return isPalindrome;
    }

    // UC5: Check palindrome using Stack data structure
    private static void checkPalindromeUsingStack() {
        String input = "noon";
        boolean result = isPalindromeUsingStack(input);
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    // Checks if a string is a palindrome using Stack (LIFO principle)
    private static boolean isPalindromeUsingStack(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Pop characters and compare with original
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}