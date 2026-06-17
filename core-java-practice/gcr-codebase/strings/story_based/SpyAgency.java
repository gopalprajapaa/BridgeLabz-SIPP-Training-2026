import java.util.Scanner;

public class SpyAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret Message
        System.out.print("Enter secret message: ");
        String message = sc.nextLine().toLowerCase();

        // Reverse Message
        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        System.out.println("Reversed Message: " + reversed);

        // Palindrome Check
        if (message.equals(reversed)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is NOT a Palindrome");
        }

        // Count Vowels and Consonants
        int vowels = 0, consonants = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Anagram Check
        System.out.print("\nEnter first intercept: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second intercept: ");
        String str2 = sc.nextLine().toLowerCase();

        if (isAnagram(str1, str2)) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are NOT Anagrams");
        }

        // First Non-Repeating Character
        System.out.print("\nEnter surveillance log: ");
        String log = sc.nextLine();

        char result = firstNonRepeating(log);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    static char firstNonRepeating(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0';
    }
}