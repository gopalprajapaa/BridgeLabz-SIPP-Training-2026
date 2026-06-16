import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitText(String text) {

        String[] words = text.split(" ");
        return words;
    }

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static int[] findShortestLongest(String[][] table) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < table.length; i++) {

            int current =
                    Integer.parseInt(table[i][1]);

            int shortLen =
                    Integer.parseInt(table[shortest][1]);

            int longLen =
                    Integer.parseInt(table[longest][1]);

            if (current < shortLen)
                shortest = i;

            if (current > longLen)
                longest = i;
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] table = createWordLengthTable(words);

        int[] result = findShortestLongest(table);

        System.out.println("Shortest Word: "
                + table[result[0]][0]);

        System.out.println("Longest Word: "
                + table[result[1]][0]);

        sc.close();
    }
}
