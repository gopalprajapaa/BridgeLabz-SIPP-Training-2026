import java.util.ArrayList;

public class EmployeeSkillAssignment {

    public static void findTeams(
            int[] skills,
            int target,
            int index,
            ArrayList<Integer> currentTeam,
            int currentSum) {

        if (currentSum == target) {
            System.out.println(currentTeam);
            return;
        }

        if (index == skills.length || currentSum > target) {
            return;
        }

        // Include current employee
        currentTeam.add(skills[index]);

        findTeams(
                skills,
                target,
                index + 1,
                currentTeam,
                currentSum + skills[index]);

        // Backtrack
        currentTeam.remove(currentTeam.size() - 1);

        // Exclude current employee
        findTeams(
                skills,
                target,
                index + 1,
                currentTeam,
                currentSum);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};

        int target = 10;

        System.out.println("Possible Teams:");

        findTeams(
                skills,
                target,
                0,
                new ArrayList<>(),
                0);
    }
}
