/**
 * Video 56: String Problems Roadmap & Core Practice Algorithms
 * Essential Interview Questions before Moving to Mutable Strings
 * Java Full Course 2026: Zero to Pro
 */
public class _07_StringRoadmapProblemsDemo {

    // Problem 1: Reverse a String without inbuilt reverse
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Problem 2: Check Palindrome (e.g. "MADAM", "RACECAR")
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Problem 3: Count Vowels and Consonants
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void main(String[] args) {
        System.out.println("=== 1. String Reversal ===");
        String input = "Java2026";
        System.out.println("Input: " + input + " -> Reversed: " + reverseString(input));

        System.out.println("\n=== 2. Palindrome Check ===");
        String word1 = "racecar";
        String word2 = "hello";
        System.out.println(word1 + " is Palindrome? " + isPalindrome(word1));
        System.out.println(word2 + " is Palindrome? " + isPalindrome(word2));

        System.out.println("\n=== 3. Vowels & Consonants Counter ===");
        String sentence = "Full Course Zero to Pro";
        System.out.println("Analyzing: '" + sentence + "'");
        countVowelsAndConsonants(sentence);

        System.out.println("\n🗺️ NEXT LEVEL ROADMAP:");
        System.out.println("1. Anagram Check (Using Sorting or Frequency Array)");
        System.out.println("2. Longest Substring Without Repeating Characters");
        System.out.println("3. Transition to Mutable Strings: StringBuilder vs StringBuffer!");
    }
}
