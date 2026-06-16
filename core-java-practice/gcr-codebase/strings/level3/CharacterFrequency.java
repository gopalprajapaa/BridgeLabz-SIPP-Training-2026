import java.util.Scanner;

public class CharacterFrequency {

    static String[][] frequencyTable(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        boolean[] visited = new boolean[256];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {

            if (!visited[text.charAt(i)]) {
                uniqueCount++;
                visited[text.charAt(i)] = true;
            }
        }

        String[][] result = new String[uniqueCount][2];

        visited = new boolean[256];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (!visited[ch]) {

                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);

                visited[ch] = true;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = frequencyTable(text);

        System.out.println("Character\tFrequency");

        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        sc.close();
    }
}
