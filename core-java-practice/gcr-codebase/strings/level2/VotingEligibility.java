import java.util.Scanner;

public class VotingEligibility {

    public static int[] getAges(int n) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print(
                    "Enter Age " + (i + 1) + ": ");

            ages[i] = sc.nextInt();
        }

        return ages;
    }

    public static String[][] votingStatus(
            int[] ages) {

        String[][] result =
                new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] =
                    String.valueOf(ages[i]);

            if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }

        return result;
    }

    public static void display(
            String[][] result) {

        System.out.println(
                "Age\tStatus");

        for (String[] row : result) {

            System.out.println(
                    row[0] + "\t"
                    + row[1]);
        }
    }

    public static void main(String[] args) {

        int[] ages = getAges(10);

        String[][] result =
                votingStatus(ages);

        display(result);
    }
}
