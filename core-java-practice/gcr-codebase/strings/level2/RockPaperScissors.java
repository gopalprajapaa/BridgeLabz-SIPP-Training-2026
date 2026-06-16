import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int choice =
                (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";

        if (choice == 1)
            return "Paper";

        return "Scissors";
    }

    public static String findWinner(
            String user,
            String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock")
                && computer.equals("Scissors"))
                ||
                (user.equals("Paper")
                        && computer.equals("Rock"))
                ||
                (user.equals("Scissors")
                        && computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number of Games: ");

        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println(
                "\nGame\tUser\tComputer\tWinner");

        for (int i = 1; i <= games; i++) {

            System.out.print(
                    "\n1-Rock 2-Paper 3-Scissors : ");

            int choice =
                    sc.nextInt();

            String user = "";

            switch (choice) {
                case 1:
                    user = "Rock";
                    break;
                case 2:
                    user = "Paper";
                    break;
                case 3:
                    user = "Scissors";
                    break;
                default:
                    System.out.println(
                            "Invalid Choice");
                    i--;
                    continue;
            }

            String computer =
                    computerChoice();

            String winner =
                    findWinner(
                            user,
                            computer);

            if (winner.equals("User"))
                userWins++;

            else if
            (winner.equals("Computer"))
                computerWins++;

            System.out.println(
                    i + "\t"
                    + user + "\t"
                    + computer + "\t\t"
                    + winner);
        }

        double userPercent =
                (userWins * 100.0)
                        / games;

        double computerPercent =
                (computerWins * 100.0)
                        / games;

        System.out.println(
                "\nUser Wins = "
                        + userWins);

        System.out.println(
                "Computer Wins = "
                        + computerWins);

        System.out.printf(
                "User Win Percentage = %.2f%%\n",
                userPercent);

        System.out.printf(
                "Computer Win Percentage = %.2f%%\n",
                computerPercent);

        sc.close();
    }
}
