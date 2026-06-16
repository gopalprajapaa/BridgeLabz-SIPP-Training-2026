import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(
            String text1,
            String text2) {

        if (text1.length() != text2.length())
            return false;

        int[] frequency = new int[256];

        for (int i = 0; i < text1.length(); i++) {

            frequency[text1.charAt(i)]++;
            frequency[text2.charAt(i)]--;
        }

        for (int count : frequency) {

            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter Second Text: ");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}
