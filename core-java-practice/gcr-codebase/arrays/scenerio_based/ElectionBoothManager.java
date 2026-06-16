import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.print("\nEnter Age (-1 to Exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age < 18) {
                System.out.println("Not Eligible to Vote");
                continue;
            }

            System.out.println("Candidates:");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");

            System.out.print("Enter Vote (1-3): ");
            int vote = sc.nextInt();

            switch (vote) {
                case 1:
                    candidate1Votes++;
                    System.out.println("Vote Recorded for Candidate A");
                    break;

                case 2:
                    candidate2Votes++;
                    System.out.println("Vote Recorded for Candidate B");
                    break;

                case 3:
                    candidate3Votes++;
                    System.out.println("Vote Recorded for Candidate C");
                    break;

                default:
                    System.out.println("Invalid Vote!");
            }
        }

        System.out.println("\n----- Election Result -----");
        System.out.println("Candidate A Votes: " + candidate1Votes);
        System.out.println("Candidate B Votes: " + candidate2Votes);
        System.out.println("Candidate C Votes: " + candidate3Votes);

        sc.close();
    }
}
